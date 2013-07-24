package com.example.controller;

import javax.servlet.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyServletContextListener implements ServletContextListener{
	public void contextInitialized(ServletContextEvent event) {
		// ���ý�Ʈ �ʱ�ȭ �� ���ý�Ʈ �Ӽ��� ����
			ServletContext sc = event.getServletContext();
			String path = sc.getInitParameter("springConfig");
			ApplicationContext context = new FileSystemXmlApplicationContext(path);
			
			sc.setAttribute("context", context);
			
			/*
			LoginHandling loginHandling = (LoginHandling)context.getBean("b");
			sc.setAttribute("loginHandling", loginHandling);
			TableHandling tableHandling = (TableHandling)context.getBean("a");
			sc.setAttribute("tableHandling", tableHandling);
			*/
	}
	
	public void contextDestroyed(ServletContextEvent event) {
		// ���ø����̼��� ���� �Ҷ� ����� �ڿ� ����
	}


}
