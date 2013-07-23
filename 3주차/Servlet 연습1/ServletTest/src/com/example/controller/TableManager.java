package com.example.controller;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.lang.*;

import com.example.model.UserTable;

public class TableManager extends HttpServlet {
	UserTable userTable = new UserTable();
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		//join.jsp 로부터 요청을 받으면 동작. 입력받은 name,age,phone 값을 가져와 테이블에 추가.
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int phoneNumber = Integer.parseInt(request.getParameter("phone"));
		userTable.setUserTable(name, age, phoneNumber);
		
		//"table" 이라는 Attribute(속성)에 값을 설정
		request.setAttribute("table", userTable.getUserTable());
		//jsp로 작업을 부탁할 RequestDispatcher를 인스턴스화
		RequestDispatcher view = request.getRequestDispatcher("userTable.jsp");
		//RequestDispatcher는 컨테이너에게 jsp를 준비하라고 요청한다음 jsp에게 request, response 객체를 넘긴다.
		view.forward(request, response);
	}
	
	//doPost메소드만 있으면 form 액션통하지 않고 요청할경우  에러남.
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setAttribute("table", userTable.getUserTable());
		RequestDispatcher view = request.getRequestDispatcher("userTable.jsp");
		view.forward(request, response);
	}
}

