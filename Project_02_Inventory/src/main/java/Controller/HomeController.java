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
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(path="/signIn",method=RequestMethod.POST)
	public String signIn(HttpServletRequest request)
	{
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		if(email.equals("admin@gmail.com") && pass.equals("admin"))
		{
			return "dashboard";
		}
		else
		{
			return "login";
		}
	}
	
	
	
	
	
	
	
	
}
