package todopackage;

import java.util.ArrayList;
import java.util.List;


public class ToDoService {

	
	
	private static  List<ToDo> todosObject = new ArrayList <ToDo>();
	
  static {
	  todosObject.add(new ToDo("Leard Web Application Developement"));
	  todosObject.add(new ToDo("Spring MVC"));
	  todosObject.add(new ToDo("Spring Rest Services"));
	  
  }

  
  
  public List<ToDo> retriveToDo() 
  {
	  return todosObject;
  }
  
 public void addTodo(ToDo vartodo)
 {
	todosObject.add(vartodo); 
 }
 
 public void deleteTodo(ToDo vartodo)
 {
	todosObject.remove(vartodo); 
 }
 
 
 
 
  
}
