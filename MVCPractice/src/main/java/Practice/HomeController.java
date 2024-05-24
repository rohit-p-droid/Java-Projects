package Practice;

import javax.servlet.http.HttpServletRequest;
import org.apache.catalina.connector.Request;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

	
@Controller
public class HomeController
{
	ApplicationContext context = new ClassPathXmlApplicationContext("Practice/spring-sevlet.xml");
	DemoDao demoDao = context.getBean("demoDao", DemoDao.class);
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("This is home url..");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is about controller..");
		return "about";
	}
	
	@RequestMapping("/Login")
	public String Login()
	{
		System.out.println("This is login ...");
		return "Login";
	}
	
	@RequestMapping(path = "/signIn", method = RequestMethod.POST)
	public String signIn(HttpServletRequest request)
	{
		String name = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		if(name.equals("hemant") && pass.equals("pass"))
		{
			return "about";
		}
		else
		{
			return "Login";
		}

	}
	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request)
	{
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		
		Demo d = context.getBean("demo", Demo.class);
		d.setUsername(name);
		d.setPassword(pass);
		int r = demoDao.insert(d);
		
		if(r > 0){
			return "about";
		}
		else{
			return "reg";
		}

	}
	
	
	
}





