package Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RawMaterialController {
	
	
	
	
	@RequestMapping("/addRawMaterial")
	public String AddRaw()
	{
		return "addRawMaterial";
	}

	@RequestMapping(path="/AddRawMaterial",method=RequestMethod.POST)
	public RedirectView insertRawMaterial(@ModelAttribute RawMaterial rawMaterial, HttpServletRequest request)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config.xml");
		RawaMaterialDao rawMaterialDao = (RawaMaterialDao) context.getBean("rawMaterialDao");
		rawMaterialDao.insert(rawMaterial);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewRawMaterial");
		return redirectView;
	}
	
	@RequestMapping("/viewRawMaterial")
	public String viewRaw(Model m)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config.xml");
		RawaMaterialDao rawMaterialDao = (RawaMaterialDao) context.getBean("rawMaterialDao");
		
		List<RawMaterial>  rawMaterial = rawMaterialDao.getAllRawMaterial();
		m.addAttribute("rawMaterial", rawMaterial);
		return "viewRawMaterial";
	}
	
	@RequestMapping(path="/delete/{id}", method=RequestMethod.GET)
	public RedirectView deleteRawMaterial(@PathVariable("id") int id, HttpServletRequest request)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config.xml");
		RawaMaterialDao rawMaterialDao = (RawaMaterialDao) context.getBean("rawMaterialDao");
		
		
		rawMaterialDao.deleteRawMaterial(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewRawMaterial");
		return redirectView;
	}
	
	@RequestMapping(path="/updateRawMaterial", method=RequestMethod.GET)
	public String updateRawPage(@RequestParam int id, Model m)
	{
		m.addAttribute("id",id);
		return "updateRawMaterial";
	}
	
	@RequestMapping("/UpdateRawMaterial")
	public RedirectView updateRawMaterial(@ModelAttribute RawMaterial rawMaterial, HttpServletRequest request)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config.xml");
		RawaMaterialDao rawMaterialDao = (RawaMaterialDao) context.getBean("rawMaterialDao");
		
		int id = Integer.parseInt(request.getParameter("id"));
		int newQuantity = Integer.parseInt(request.getParameter("quantity"));
		RawMaterial updateRawMaterial = rawMaterialDao.getRawMaterial(id);
		updateRawMaterial.setQuantity(updateRawMaterial.getQuantity() + newQuantity);
		rawMaterialDao.updateRawMaterial(updateRawMaterial);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewRawMaterial");
		return redirectView;
		
	}
	
	@RequestMapping(path="/issueRawMaterial", method=RequestMethod.GET)
	public String issueRawPage(@RequestParam int id, Model m)
	{
		m.addAttribute("id",id);
		return "issueRawMaterial";
	}
	
	@RequestMapping("/IssueRawMaterial")
	public RedirectView issueRawMaterial(@ModelAttribute RawMaterial rawMaterial,@ModelAttribute IssueRawMaterial issueRawMaterial, HttpServletRequest request)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config.xml");
		RawaMaterialDao rawMaterialDao = (RawaMaterialDao) context.getBean("rawMaterialDao");
		
		int id = Integer.parseInt(request.getParameter("itemId"));
		int newQuantity = Integer.parseInt(request.getParameter("quantity"));
		RawMaterial updateRawMaterial = rawMaterialDao.getRawMaterial(id);
		updateRawMaterial.setQuantity(updateRawMaterial.getQuantity() - newQuantity);
		rawMaterialDao.updateRawMaterial(updateRawMaterial);
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Controller/config3.xml");
		IssueRawMaterialDao issueRawMaterialDao = (IssueRawMaterialDao) context2.getBean("issueRawMaterialDao");
		issueRawMaterialDao.insert(issueRawMaterial);
		
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewRawMaterial");
		return redirectView;
		
	}
	
	@RequestMapping("/viewIssuerRawMaterialLog")
	public String viewIssueRaw(Model m)
	{
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Controller/config3.xml");
		IssueRawMaterialDao issueRawMaterialDao = (IssueRawMaterialDao) context2.getBean("issueRawMaterialDao");
		
		List<IssueRawMaterial>  issueRawMaterial = issueRawMaterialDao.getAllIssueRawMaterial();
		m.addAttribute("issueRawMaterial", issueRawMaterial);
		return "viewIssuerRawMaterialLog";
	}
	
	@RequestMapping(path="/delete3/{id}", method=RequestMethod.GET)
	public RedirectView deleteIssueRawMaterial(@PathVariable("id") int id, HttpServletRequest request)
	{
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Controller/config3.xml");
		IssueRawMaterialDao issueRawMaterialDao = (IssueRawMaterialDao) context2.getBean("issueRawMaterialDao");
		
		
		issueRawMaterialDao.deleteIssueRawMaterial(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewIssuerRawMaterialLog");
		return redirectView;
	}
	
	@RequestMapping("/UnavailableRawMaterial")
	public String viewUnavailableRaw(Model m)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config.xml");
		RawaMaterialDao rawMaterialDao = (RawaMaterialDao) context.getBean("rawMaterialDao");
		
		List<RawMaterial>  rawMaterial = rawMaterialDao.getAllRawMaterial();
		m.addAttribute("rawMaterial", rawMaterial);
		return "UnavailableRawMaterial";
	}
	
	
	
}
