package com.test.springmvc;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.test.userTable.User;
import com.test.userTable.UserTable;

public class LoginHandling {
	
	private ApplicationContext context = null;
	//private ServletContext servletContext = null;
	//UserTable userTable = null;
	
	//UserTable userTable = new UserTable();
	//UserTable userTable = UserTable.getInstance();

	private UserTable userTable;
	
	public UserTable getUserTable() {
		return userTable;
	}

	public void setUserTable(UserTable userTable) {
		this.userTable = userTable;
	}

	public void run(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
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
	}
}
