package com.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.contorller.TestController;

// prehandler->request해서session을 가져온다. null인경우 회원이 아니기 떄문에 로그인 안되고, return true까지 실행을 해주고,
// post-> modelandView를 매개 변수로, 332~33라인 handler에 어떤 클래스의 어떤 함수가 싱행했는지 정보가 들어 있는데, 그 클래스 정보만 뽑아온다.
// ex. homeController의 주소가 home, test의 main, login의 주소는 지정한 jsp가 아니라 다른 페이지로 이동 시킨다.
// sesiion정보 검사를 하고 , return ture로 지정해놓은 주소가 실행 되고, ex. /main으로 실행을 하면 위에 로그인 했는 지 안했는지를 검사하고,
// 로그인 정보 없음이 되고, return ture로 /main 함수가 실행되고, 그 다음 posthandelr이 실행되는데
// 다른 페이지로 이동 시킬 수 있다.(가 주제임) , post handler 실행되고 나서 class정보를 뽑아 오고, class가 무엇인지 뽑아 오고,
// tesController 2가지 걸러서, ModelandVeiw를 이용해서 login.jsp로 페이지 변경한다.
// 홍길동으로 넣어준다음 끝을 내고, /main과 /login은 main, loginForm 이 아니라 login.jsp를 보이게 된다.
// /home 요청은, 그 위에 pre가 실행되고, return true로 /home함수가 실행되고, main.jsp를 얻은 상태에서 post로 들어옴
// 클래스 정보 얻오고고, 인스턴스 에서 걸리지 않고  skip한 후, main.jsp로 이동하게 된다. 
public class MyHandlerInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandler:   "+ handler);
		HttpSession session = request.getSession();
		if(session.getAttribute("login") == null) {
			//response.sendRedirect("loginForm"); //loginForm호출 시도 handler 호출의 문제가 발생됨.
			//계속 반복적으로 실행되서 결국 에러 남. 
			System.out.println("로그인 정보 없음.");
		}
		return true;//주의
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView mav) throws Exception {
		System.out.println("posthandler=====");
		HandlerMethod method = (HandlerMethod)handler;
		if(method.getBean() instanceof TestController) {//TestController요청주소만 따로 처리
			System.out.println("Testcontroller의 경우 postHandler에서 view페이지 설정");
			mav.setViewName("login");
			mav.addObject("data", "홍길동");
		}//end if
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion===========");
	}

	
	
}
