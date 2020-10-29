package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

public class PersonAroundAspect {


	public Object around(ProceedingJoinPoint pjp){

		Object obj = null;
		System.out.println("around 함수 실행 before=========");
		
		try {
			obj = pjp.proceed();
			System.out.println("around 함수 실행 후=======");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
		
	}
	
}
