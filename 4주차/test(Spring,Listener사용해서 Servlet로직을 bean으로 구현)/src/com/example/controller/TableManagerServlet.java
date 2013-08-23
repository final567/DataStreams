package com.example.controller;
import javax.servlet.*;
import javax.servlet.http.*;

import org.springframework.context.ApplicationContext;
import java.io.*;
import com.example.model.*;

@SuppressWarnings("serial")
public class TableManagerServlet extends HttpServlet {
	ApplicationContext context = null;
	private TableHandling tableHandling = null;
	UserTable userTable = null;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//UserTable userTable = ((TableHandling)getServletContext().getAttribute("tableHandling")).run(request, response);
		UserTable userTable = tableHandling.run(request, response);
		
		//"table" 이라는 Attribute(속성)에 값을 설정
		request.setAttribute("table", userTable.getUserTable());
		//jsp로 작업을 부탁할 RequestDispatcher를 인스턴스화
		RequestDispatcher view = request.getRequestDispatcher("userTable.jsp");
		//RequestDispatcher는 컨테이너에게 jsp를 준비하라고 요청한다음 jsp에게 request, response 객체를 넘긴다.
		view.forward(request, response);
	}
	
	//doPost메소드만 있으면 form(POST) 액션통하지 않고 요청할경우  에러남.
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("table", userTable.getUserTable());
		RequestDispatcher view = request.getRequestDispatcher("userTable.jsp");
		view.forward(request, response);
	}
	
	public void init() throws ServletException {
		context = (ApplicationContext)getServletContext().getAttribute("context");
		tableHandling = (TableHandling)context.getBean("tableHandling");
		userTable = (UserTable)context.getBean("userTable");
	}
}

