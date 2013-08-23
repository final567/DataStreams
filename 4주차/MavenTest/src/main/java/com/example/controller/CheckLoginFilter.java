package com.example.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

import org.springframework.context.ApplicationContext;

/**
 * Servlet Filter implementation class CheckID
 */
@WebFilter("/CheckID")
public class CheckLoginFilter implements Filter{
	ApplicationContext context = null;
	private FilterConfig filterConfig = null;
	private ServletContext servletContext = null;
	private LoginHandling loginHandling = null;
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
		//((LoginHandling) servletContext.getAttribute("loginHandling")).run(request, response, chain);
		loginHandling.run(request, response, chain);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = fConfig;
		this.servletContext = filterConfig.getServletContext();
		context = (ApplicationContext)servletContext.getAttribute("context");
		loginHandling = (LoginHandling)context.getBean("loginHandling");
	}

}