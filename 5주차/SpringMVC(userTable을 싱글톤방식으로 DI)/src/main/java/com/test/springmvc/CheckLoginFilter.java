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
		
		// �α��� ���� ����
	    String userID="test";
	    String userPWD="test";
	    //String userName="�̸�";
	    
	    // login.jsp�κ��� form data�� �޴´�
	    String id = request.getParameter("id");
	    String pwd = request.getParameter("password");
	
	    boolean login=false;
	    if(session==null) {         //������ ����Ǿ� ���� ������..
	    	for(Object user:userTable.getUserTable()){  //�����ڰ� �߰��� ���� �̸��� ��ȭ��ȣ�� id,pwd �� ��
	    		if((((User)user).getName()).equals(id) && (((User)user).getPhoneNumber()).equals(pwd)){
	    			login = true;
	    		} 
	    	}
	    	if(userID.equals(id) && userPWD.equals(pwd) || login==true) { //������ id,pwd�� �°ų� �����ڰ� �߰��� ������ id,pwd ������� ���� ����
	    		session = ((HttpServletRequest)request).getSession();
	    		((HttpServletResponse)response).sendRedirect("JoinUser");
	    	}
	    	else { //���ǵ� ����Ǿ������ʰ� id,pwd �˻絵 ��� ���Ұ�� �α��� ��������...
	    		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		    	dispatcher.forward(request, response);
	    	}
	    }
	    else {  //������ ����Ǿ� ������� ��û�� ��������...
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