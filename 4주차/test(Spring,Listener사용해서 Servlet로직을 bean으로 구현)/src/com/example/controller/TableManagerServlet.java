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
		
		//"table" �̶�� Attribute(�Ӽ�)�� ���� ����
		request.setAttribute("table", userTable.getUserTable());
		//jsp�� �۾��� ��Ź�� RequestDispatcher�� �ν��Ͻ�ȭ
		RequestDispatcher view = request.getRequestDispatcher("userTable.jsp");
		//RequestDispatcher�� �����̳ʿ��� jsp�� �غ��϶�� ��û�Ѵ��� jsp���� request, response ��ü�� �ѱ��.
		view.forward(request, response);
	}
	
	//doPost�޼ҵ常 ������ form(POST) �׼������� �ʰ� ��û�Ұ��  ������.
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

