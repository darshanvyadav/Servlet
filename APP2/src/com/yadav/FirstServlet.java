package com.yadav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//general setting 
		
		response.setContentType("text/html");
		PrintWriter Writer = response.getWriter();
		//get config 
		ServletConfig config = this.getServletConfig();
		String shirt = config.getInitParameter("Shirt");
		String oil = config.getInitParameter("Oil");
		Writer.println("************ innt parm **********");
		Writer.println("<br>");
		Writer.println("First initial param " + shirt);
		Writer.println("<br>");
		Writer.println("Second initila param" + oil);
		Writer.println("<br>");
		
		ServletContext context = config.getServletContext();
		String username = context.getInitParameter("Username"); 
		String password = context.getInitParameter("Password"); 
		Writer.println("context param ");
		
		Writer.println(username + " ***************  " +  password );
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
