package Controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ProcessedMaterialController {
	
	@RequestMapping("/addProcessedMaterial")
	public String AddProcessed()
	{
		return "addProcessedMaterial";
	}

	@RequestMapping(path="/AddProcessedMaterial",method=RequestMethod.POST)
	public RedirectView insertProcessedMaterial(@ModelAttribute ProcessedMaterial processedMaterial, HttpServletRequest request)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config2.xml");
		ProcessedMaterialDao processedMaterialDao = (ProcessedMaterialDao) context.getBean("processedMaterialDao");
		processedMaterialDao.insert(processedMaterial);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewProcessedMaterial");
		return redirectView;
	}
	
	@RequestMapping("/viewProcessedMaterial")
	public String viewProcessedMaterial(Model m)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config2.xml");
		ProcessedMaterialDao processedMaterialDao = (ProcessedMaterialDao) context.getBean("processedMaterialDao");
		
		List<ProcessedMaterial>  processedMaterial = processedMaterialDao.getAllProcessedMaterial();
		m.addAttribute("processedMaterial", processedMaterial);
		return "viewProcessedMaterial";
	}
	
	@RequestMapping(path="/delete2/{pid}", method=RequestMethod.GET)
	public RedirectView deleteProcessMaterial(@PathVariable("pid") int pid, HttpServletRequest request)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config2.xml");
		ProcessedMaterialDao processedMaterialDao = (ProcessedMaterialDao) context.getBean("processedMaterialDao");
		
		processedMaterialDao.deleteProcessedMaterial(pid);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewProcessedMaterial");
		return redirectView;
	}
	
	@RequestMapping(path="/updateProcessedMaterial", method=RequestMethod.GET)
	public String updateProcessPage(@RequestParam int pid, Model m)
	{
		m.addAttribute("pid",pid);
		return "updateProcessedMaterial";
	}
	
	@RequestMapping("/UpdateProcessedMaterial")
	public RedirectView updateProcessedMaterial(@ModelAttribute ProcessedMaterial processedMaterial, HttpServletRequest request)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config2.xml");
		ProcessedMaterialDao processedMaterialDao = (ProcessedMaterialDao) context.getBean("processedMaterialDao");
		
		int id = Integer.parseInt(request.getParameter("pid"));
		int newQuantity = Integer.parseInt(request.getParameter("quantity"));
		ProcessedMaterial updateProcessedMaterial = processedMaterialDao.getProcessedMaterial(id);
		updateProcessedMaterial.setPquantity(updateProcessedMaterial.getPquantity() + newQuantity);
		processedMaterialDao.updateProcessedMaterial(updateProcessedMaterial);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewProcessedMaterial");
		return redirectView;
		
	}
	
	@RequestMapping(path="/issueProcessedMaterial", method=RequestMethod.GET)
	public String issueProcessPage(@RequestParam int pid, Model m)
	{
		m.addAttribute("pid",pid);
		return "issueProcessedMaterial";
	}
	
	@RequestMapping("/IssueProcessedMaterial")
	public RedirectView issueProcessedMaterial(@ModelAttribute ProcessedMaterial processedMaterial,@ModelAttribute IssueProcessedMaterial issueProcessedMaterial, HttpServletRequest request)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config2.xml");
		ProcessedMaterialDao processedMaterialDao = (ProcessedMaterialDao) context.getBean("processedMaterialDao");
		
		int id = Integer.parseInt(request.getParameter("PitemId"));
		int newQuantity = Integer.parseInt(request.getParameter("Pquantity"));
		ProcessedMaterial updateProcessedMaterial = processedMaterialDao.getProcessedMaterial(id);
		updateProcessedMaterial.setPquantity(updateProcessedMaterial.getPquantity() - newQuantity);
		processedMaterialDao.updateProcessedMaterial(updateProcessedMaterial);
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Controller/config4.xml");
		IssueProcessedMaterialDao issueProcessedMaterialDao = (IssueProcessedMaterialDao) context2.getBean("issueProcessedMaterialDao");
		issueProcessedMaterialDao.insert(issueProcessedMaterial);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/viewProcessedMaterial");
		return redirectView;
		
	}

	@RequestMapping("/issueProcessedMaterialLog")
	public String viewIssueProcessed(Model m)
	{
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Controller/config4.xml");
		IssueProcessedMaterialDao issueProcessedMaterialDao = (IssueProcessedMaterialDao) context2.getBean("issueProcessedMaterialDao");
		
		List<IssueProcessedMaterial>  issueProcessedMaterial = issueProcessedMaterialDao.getAllIssueProcessedMaterial();
		m.addAttribute("issueProcessedMaterial", issueProcessedMaterial);
		return "issueProcessedMaterialLog";
	}
	
	@RequestMapping(path="/delete4/{id}", method=RequestMethod.GET)
	public RedirectView deleteIssueProcessedMaterial(@PathVariable("id") int id, HttpServletRequest request)
	{
		ApplicationContext context2 = new ClassPathXmlApplicationContext("Controller/config4.xml");
		IssueProcessedMaterialDao issueProcessedMaterialDao = (IssueProcessedMaterialDao) context2.getBean("issueProcessedMaterialDao");
		
		
		issueProcessedMaterialDao.deleteIssueProcessedMaterial(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/issueProcessedMaterialLog");
		return redirectView;
		
	}
	
	@RequestMapping("/UnavailableProcessedMaterial")
	public String UnavailableProcessedMaterial(Model m)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Controller/config2.xml");
		ProcessedMaterialDao processedMaterialDao = (ProcessedMaterialDao) context.getBean("processedMaterialDao");
		
		List<ProcessedMaterial>  processedMaterial = processedMaterialDao.getAllProcessedMaterial();
		m.addAttribute("processedMaterial", processedMaterial);
		return "UnavailableProcessedMaterial";
	}
	
	
}
