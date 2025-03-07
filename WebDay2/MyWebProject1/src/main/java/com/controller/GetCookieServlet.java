package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GetCookieServlet
 */
@WebServlet("/GetCookieServlet")
public class GetCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
	      Cookie cookies[] = request.getCookies();
          String color = "white";
          if (cookies != null) {
              for (Cookie c : cookies) {
                  if (c.getName().equals("bgc")) {
                      color = c.getValue();
                  }
              }
          }
          out.println("<!DOCTYPE html>");
          out.println("<html>");
          out.println("<head>");
          out.println("<title>Servlet GetCookieServlet</title>");            
          out.println("</head>");
          out.println("<body bgcolor="+color+">");
          out.println("<h1>Servlet GetCookieServlet at " + request.getContextPath() + "</h1>");
          
          if (cookies != null) {
              for (Cookie c : cookies) {
                  out.println ("<h2> Cookie name - "+c.getName() + " Value = "+c.getValue());
              }
          }
          
          out.println("</body>");
          out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
