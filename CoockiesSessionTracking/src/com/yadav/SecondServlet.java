package com.yadav;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// get the requested detailes 
		
		String uqual = request.getParameter("uqual");
		String udesig = request.getParameter("udesig");
		
		
		// prepare Session // it locate the object // since it is second request to create session object 
		
//		HttpSession Session = request.getSession(false);
//		
//		
//		Session.setAttribute("uqual", uqual);
//		Session.setAttribute("udesig", udesig);

		// create cookie and stor it in response object
		
		Cookie cookie1 = new Cookie("uqual", uqual);
		Cookie cookie2 = new Cookie("udesig", udesig);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
	
		// forward request to senst form 
		
		RequestDispatcher rf = request.getRequestDispatcher("form3.html");
		rf.forward(request, response);
		
				
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
