package webapp.loginservice;

public class LoginService {
	
	public boolean isUserValid(String User,String Pass) {
		
		if (User.equals("Darshan")  && Pass.equals("Venkanna") )
          return true;
		return false;
	}

}
