package com.test.springmvc;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.test.userTable.User;
import com.test.userTable.UserTable;

/**
 * Servlet Filter implementation class CheckID
 */
public class CheckLoginFilter implements Filter{
	private ApplicationContext context = null;
	private FilterConfig filterConfig = null;
	private ServletContext servletContext = null;
	private LoginHandling loginHandling = null;
	//UserTable userTable = new UserTable();
    /**
     * Default constructor. 
     */
    public CheckLoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		/*
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
	    */
		loginHandling.run(request, response, chain);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = fConfig;
		this.context = WebApplicationContextUtils.getWebApplicationContext(filterConfig.getServletContext());
		loginHandling = (LoginHandling) context.getBean("loginHandling");
	}
}