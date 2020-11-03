package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentBeforeAspect {
@Pointcut("execution(* callEcho(..))")
public void xxx() {}

@After("xxx()")
public void callEchoAfter(JoinPoint point) {
	System.out.println("공통로직 callEchoAfter========");
}
@After("execution(* sayEcho(...))")
public void sayEchoAfter(){
	
	System.out.println("공통로직sayEchoAfter============");
}
	

}
