package com.yadav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        PrintWriter Writer = response.getWriter();
        String uname = request.getParameter("uname");
        String upwd = request.getParameter("upwd");
       if (uname.equals("Darshan")&& upwd.equals("Darshan")) {
		 
    	   Writer.println("opopps login failed try with valid user name and passowrd");
    	   RequestDispatcher dispatcher = request.getRequestDispatcher("SuccessServlet");
    	   dispatcher.forward(request, response);
       
	}
       else {
		Writer.println("opopps login failed try with valid user name and passowrd");
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
		dispatcher.include(request, response);
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
