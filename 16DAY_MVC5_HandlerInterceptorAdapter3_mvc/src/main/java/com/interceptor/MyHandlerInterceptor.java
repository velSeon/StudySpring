package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyHandlerInterceptor extends HandlerInterceptorAdapter{
//main, home 주소만 인터셉터 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandle====");
		HttpSession session = request.getSession();
		if(session.getAttribute("login")==null) { //xml에서 특정 주소에 대한 요청만 처리함 
			System.out.println("prehandle 로그인 정보 없음======");
			response.sendRedirect("loginForm"); //페이지 이동-loginForm
		}
		return true; //주의
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView mav) throws Exception {
		System.out.println("postHandle=========");
		mav.addObject("data","홍길동");
		mav.setViewName("main");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion===========");
	}

	
}
