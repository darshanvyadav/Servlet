package todopackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.loginservice.LoginService;

@WebServlet(urlPatterns = "/It'sTodo")
public class ToDoServlet extends HttpServlet {

 ToDoService ToDoServicevar = new ToDoService();	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  
	{  
		request.setAttribute("todos",new ToDoService().retriveToDo());
		request.getRequestDispatcher("/WEB-INF/Views/ToDoJSP.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  
	{  
		String newTodo = request.getParameter("Uganda");
		ToDoServicevar.addTodo(new ToDo(newTodo));
		
	//	request.setAttribute("todos",new ToDoService().retriveToDo());
	//	request.getRequestDispatcher("/WEB-INF/Views/ToDoJSP.jsp").forward(request, response);
		
		response.sendRedirect("/yadav/It'sTodo");
		
	}

	
	
}