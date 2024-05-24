package Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

public class PoliceStationController
{

	@RequestMapping(path="/stationReg", method=RequestMethod.POST)
	public String insertPoliceStation(@ModelAttribute policeStation PoliceStation, HttpServletRequest request)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/confi1.xml");
		policeStationDao policeStationDao = (policeStationDao) context.getBean("PoliceStationDao");
		policeStationDao.insert(PoliceStation);
		
		return "index";
	}

}