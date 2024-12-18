package com.Servlet.ServletTesting;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Servlet-Test", urlPatterns="/welcome.com" , loadOnStartup=1)
public class ServletTEST   extends HttpServlet{
	
	
	
	public  void init(ServletConfig  config) {
		
		
	}
	
	
	
	public void service(HttpServletRequest  request, HttpServletResponse  response) throws ServletException, IOException {
	String sessionid=request.changeSessionId();
		  System.out.println(sessionid); 
		  
		  
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	String email=request.getParameter("email");
	
	System.out.println("Username:"+username);
	System.out.println("Password:"+password);
	System.out.println("Email:"+email);
	
	request.setAttribute("Data",username +"   "+ password+"    "+ email);
		  
	
	RequestDispatcher rd=request.getRequestDispatcher("data.html");
	rd.forward(request, response);
	
	}
	
	
	
	public void destroy() {
		
		
		
		
	}
	

}
