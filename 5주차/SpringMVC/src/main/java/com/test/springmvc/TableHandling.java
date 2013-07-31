package com.test.springmvc;


import javax.servlet.http.*;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.test.userTable.UserTable;


public class TableHandling implements Controller {
	/*
	ApplicationContext context = null;
	private TableHandling tableHandling = null;
	UserTable userTable = null;
	*/

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO �ڵ� ������ �޼ҵ� ����
		//join.jsp �κ��� ��û�� ������ ����. �Է¹��� name,age,phone ���� ������ ���̺� �߰�.
		/*
		context = (ApplicationContext)request.getSession().getServletContext().getAttribute("context");
		tableHandling = (TableHandling)context.getBean("tableHandling");
		userTable = (UserTable)context.getBean("userTable");
		*/
		
		UserTable userTable = new UserTable();																																																																										
		//request.setCharacte	rEncoding("UTF-8");
		if(request.getParameter("name")!=null & request.getParameter("age")!=null & request.getParameter("phone")!=null){
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			String phoneNumber = request.getParameter("phone");
			userTable.setUserTable(name, age, phoneNumber);
		}

		
		ModelAndView mav = new ModelAndView("userTable");
        mav.addObject("table", userTable.getUserTable());
        return mav;
	}

}
