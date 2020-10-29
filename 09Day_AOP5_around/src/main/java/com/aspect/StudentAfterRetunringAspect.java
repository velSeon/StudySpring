package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class StudentAfterRetunringAspect {

	@Around("execution(* sayEcho(..))")
	public Object sayEchoAfterReturning(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("Before");
		Object retVal = pjp.proceed();
		System.out.println("After");
		System.out.println("reTval:"+retVal);
		return retVal;
	}
	
}
