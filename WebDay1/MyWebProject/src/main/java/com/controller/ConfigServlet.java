package com.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class ConfigServlet
 */
@WebServlet(
		urlPatterns = { "/ConfigServlet" }, 
		initParams = { 
				@WebInitParam(name = "jdbcurl", value = "jdb:mysql://localhost:3306/hr")
		})
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		ServletConfig config=getServletConfig();
		String sname=config.getServletName();
		out.println("<h3>Servlet name is "+sname+"</h3>");
		
		String url= config.getInitParameter("jdbcurl");
		out.println("<h3> URL = "+url +"</h3>");
		
		ServletContext application=getServletContext();
		List<String> myplist= (List<String>) application.getAttribute("plist");
		
		for(String p: myplist) {
			out.println("<h3> "+ p +"</h3>");
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
