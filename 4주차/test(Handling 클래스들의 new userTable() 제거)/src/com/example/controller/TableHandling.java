package com.example.controller;

import java.io.IOException;

import javax.servlet.http.*;

import org.springframework.context.ApplicationContext;

import com.example.model.UserTable;


public class TableHandling {
	/*
	ApplicationContext context = null;
	private TableHandling tableHandling = null;
	UserTable userTable = null;
	*/
	public UserTable run(HttpServletRequest request, HttpServletResponse response, UserTable userTable) throws IOException {
		//join.jsp 로부터 요청을 받으면 동작. 입력받은 name,age,phone 값을 가져와 테이블에 추가.
		/*
		context = (ApplicationContext)request.getSession().getServletContext().getAttribute("context");
		tableHandling = (TableHandling)context.getBean("tableHandling");
		userTable = (UserTable)context.getBean("userTable");
		*/
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String phoneNumber = request.getParameter("phone");
		userTable.setUserTable(name, age, phoneNumber);
		
		return userTable;
	}

}
