package com.example.controller;

import javax.servlet.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyServletContextListener implements ServletContextListener{
	public void contextInitialized(ServletContextEvent event) {
		// 컨택스트 초기화 후 컨택스트 속성에 저장
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
		// 애플리케이션을 종료 할때 사용한 자원 정리
	}


}
