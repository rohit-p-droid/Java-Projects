package Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("This is home url..");
		return "index";
	}
	
	@RequestMapping("/adminLogin")
	public String login()
	{
		return "adminLogin";
	}

	@RequestMapping(path="/Login",method=RequestMethod.POST)
	public String Login(HttpServletRequest request)
	{
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		if(email.equals("admin@gmail.com") && pass.equals("admin"))
			return "adminPanel";
		else
			return "adminLogin";
	}
	
	@RequestMapping("/RegPolice")
	public String policeRegistration()
	{
		return "RegPolice";
	}
	

}
