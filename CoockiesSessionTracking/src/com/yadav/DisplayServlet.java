package com.yadav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter Writer = response.getWriter();
		
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		
		HttpSession Session = request.getSession(false);
		
		// print all details of the client.
		
		// totla 6 - objects - from this class 4 from session id.
		
		Cookie[] allCookies = request.getCookies();
		
		Writer.println("username:  " + allCookies[0].getValue());
     	Writer.println("<br>");
		Writer.println("user age:  "+ allCookies[1].getValue());
		Writer.println("<br>");
		Writer.println("user designation: " +  allCookies[3].getValue());
		Writer.println("<br>");
		Writer.println("user qualification:  " +  allCookies[2].getValue());
		Writer.println("<br>");
		Writer.println("user mobile number: " + mobile);
		Writer.println("<br>");
		Writer.println("user email address: " + email);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
