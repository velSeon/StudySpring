package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect //공통로직 부분, 핵심로직 어느 함수에서 실행할지에 대한 등록과 실행할 코드 구현
public class PersonBeforeAspect {

	public void mesgBefore() {
		System.out.println("공통로직 aop의 mesgBefore()+++++++++++++++++++++");
	}
	
	
}
