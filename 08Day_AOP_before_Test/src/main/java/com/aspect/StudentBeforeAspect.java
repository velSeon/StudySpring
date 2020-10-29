package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect //공통로직 부분, 핵심로직 어느 함수에서 실행할지에 대한 등록과 실행할 코드 구현
public class StudentBeforeAspect {
//advice + pointcut을 분리
@Pointcut("execution(* call*(..))")//CALL이라는 함수가 실행할 경우//모든 리턴타입, 뒤에 ..은 calld이란 함수가 실행될때 xxx함수가 관여하겠다.
public void xxx() {} //실제 공통로직이 구현된 함수 (ADVICE)-xxx()함수실행 등록

@Before("xxx()")//JoinPoint 공통로직이 실행될 시점, 
public void callEchoBefore(JoinPoint point) {
	System.out.println("공통로직===="+point);
	System.out.println("공통로직===="+point.getSignature().getName());
	System.out.println("공통로직======= callEchoBefore");
}

	
	 @Before("execution(* sayEcho*(..))") 
	 public void sayEchoBefore() {
	 System.out.println("sayEchoBefore"); 
	 }
	 
	
	
}
