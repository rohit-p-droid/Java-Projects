package Controller;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class IssueProcessedMaterialDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional 
	public int insert(IssueProcessedMaterial issueProcessedMaterial) 
	{
		Integer i = (Integer) this.hibernateTemplate.save(issueProcessedMaterial);
		return i;
	}
	
	
	public IssueProcessedMaterial getIssueProcessedMaterial(int id)
	{
		IssueProcessedMaterial issueProcessedMaterial = this.hibernateTemplate.get(IssueProcessedMaterial.class, id);
		return issueProcessedMaterial;
	}
	

	public List<IssueProcessedMaterial> getAllIssueProcessedMaterial()
	{
		List<IssueProcessedMaterial> issueProcessedMaterial = this.hibernateTemplate.loadAll(IssueProcessedMaterial.class);
		return issueProcessedMaterial;
	}
	
	@Transactional 
	public void deleteIssueProcessedMaterial(int id) 
	{
		IssueProcessedMaterial issueProcessedMaterial = this.hibernateTemplate.get(IssueProcessedMaterial.class, id);
		this.hibernateTemplate.delete(issueProcessedMaterial);
	}
	@Transactional 
	public void updateIssueProcessedMaterial(IssueProcessedMaterial issueProcessedMaterial)
	{
		this.hibernateTemplate.update(issueProcessedMaterial);
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
