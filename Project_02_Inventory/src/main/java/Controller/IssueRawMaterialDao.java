package Controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class IssueRawMaterialDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional 
	public int insert(IssueRawMaterial issueRawMaterial) 
	{
		Integer i = (Integer) this.hibernateTemplate.save(issueRawMaterial);
		return i;
	}
	
	
	public IssueRawMaterial getIssueRawMaterial(int id)
	{
		IssueRawMaterial issueRawMaterial = this.hibernateTemplate.get(IssueRawMaterial.class, id);
		return issueRawMaterial;
	}
	

	public List<IssueRawMaterial> getAllIssueRawMaterial()
	{
		List<IssueRawMaterial> issueRawMaterial = this.hibernateTemplate.loadAll(IssueRawMaterial.class);
		return issueRawMaterial;
	}
	
	@Transactional 
	public void deleteIssueRawMaterial(int id) 
	{
		IssueRawMaterial issueRawMaterial = this.hibernateTemplate.get(IssueRawMaterial.class, id);
		this.hibernateTemplate.delete(issueRawMaterial);
	}
	@Transactional 
	public void updateIssueRawMaterial(IssueRawMaterial issueRawMaterial)
	{
		this.hibernateTemplate.update(issueRawMaterial);
	}
	
	
	public HibernateTemplate getHibernateTemplate()
	{
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate)
	{
		this.hibernateTemplate = hibernateTemplate;
	}

}
