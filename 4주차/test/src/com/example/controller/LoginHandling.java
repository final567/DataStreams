package com.example.controller;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;

import com.example.model.User;
import com.example.model.UserTable;

public class LoginHandling {
	/*
	private ApplicationContext context = null;
	private ServletContext servletContext = null;
	UserTable userTable = null;
	*/
	UserTable userTable = new UserTable();
	
	public void run(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest)request).getSession(false);
		
		// 로그인 정보 설정
	    String userID="test";
	    String userPWD="test";
	    //String userName="이름";
	    
	    // login.jsp로부터 form data를 받는다
	    String id = request.getParameter("id");
	    String pwd = request.getParameter("password");
	
	    boolean login=false;
	    if(session==null) {         //세션이 연결되어 있지 않으면..
	    	for(Object user:userTable.getUserTable()){  //관리자가 추가한 유저 이름과 전화번호를 id,pwd 와 비교
	    		if((((User)user).getName()).equals(id) && (((User)user).getPhoneNumber()).equals(pwd)){
	    			login = true;
	    		}
	    	}
	    	if(userID.equals(id) && userPWD.equals(pwd) || login==true) { //관리자 id,pwd가 맞거나 관리자가 추가한 유저의 id,pwd 맞을경우 세션 연결
	    		session = ((HttpServletRequest)request).getSession();
	    		((HttpServletResponse)response).sendRedirect("JoinUser");
	    	}
	    	else { //세션도 연결되어있지않고 id,pwd 검사도 통과 못할경우 로그인 페이지로...
	    		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		    	dispatcher.forward(request, response);
	    	}
	    }
	    else {  //세션이 연결되어 있을경우 요청한 페이지로...
	    	chain.doFilter(request, response);
	    }
	}
	/*
	public void init(LoginHandling config) throws ServletException {
		servletContext = config.servletContext; 
		context = (ApplicationContext)servletContext.getAttribute("context");
		userTable = (UserTable)context.getBean("userTable");
	}
	*/
}
