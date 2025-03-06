package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.bean.MyUser;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String username= request.getParameter("user");
		String password= request.getParameter("pass");
		
		if(username.equals("tomcat") && password.equals("tomcat")) {
			
			String email= username+"@abc.com";
			MyUser ob=new MyUser();
			ob.setUser(username);
			ob.setEmail(email);
			
			request.setAttribute("myuser", ob);  // request scope
			
		//	response.sendRedirect("Success.jsp");
			RequestDispatcher red= request.getRequestDispatcher("Success.jsp");
			red.forward(request, response);
			
		}else {
			RequestDispatcher red= request.getRequestDispatcher("Login.jsp");
			red.include(request, response);
			out.println("<font color='red' > Invalid Username or Password </font>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
