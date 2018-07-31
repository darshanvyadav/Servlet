package todopackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.loginservice.LoginService;

@WebServlet(urlPatterns = "/delete-servleturl")
public class deletServletTodo extends HttpServlet {

 ToDoService ToDoServicevar = new ToDoService();	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  
	{  
		ToDoServicevar.deleteTodo(new ToDo(request.getParameter("todo")));
		response.sendRedirect("/yadav/It'sTodo");
	}


	
}