package com.example.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import com.example.model.UserTable;


public class TableHandling {
	/*
	private ApplicationContext context = null;
	private ServletContext servletContext = null;
	UserTable userTable = null;
	*/
	UserTable userTable = new UserTable();
	
	public UserTable run(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//join.jsp �κ��� ��û�� ������ ����. �Է¹��� name,age,phone ���� ������ ���̺� �߰�.
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String phoneNumber = request.getParameter("phone");
		userTable.setUserTable(name, age, phoneNumber);
		
		return userTable;
	}
	/*
	public void init(TableHandling config) throws ServletException {
		servletContext = config.servletContext; 
		context = (ApplicationContext)servletContext.getAttribute("context");
		userTable = (UserTable)context.getBean("userTable");
	}
	*/
}
