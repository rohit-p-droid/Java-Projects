package Controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class ProcessedMaterialDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional 
	public int insert(ProcessedMaterial processedMaterial) {
		// insert
		Integer i = (Integer) this.hibernateTemplate.save(processedMaterial);
		return i;
		}
	
	
	public ProcessedMaterial getProcessedMaterial(int pid) 
	{
		ProcessedMaterial processedMaterial = this.hibernateTemplate.get(ProcessedMaterial.class, pid);
		return processedMaterial;
	}
	

	public List<ProcessedMaterial> getAllProcessedMaterial()
	{
		List<ProcessedMaterial> processedMaterial = this.hibernateTemplate.loadAll(ProcessedMaterial.class);
		return processedMaterial;
	}
	
	@Transactional 
	public void deleteProcessedMaterial(int pid) 
	{
		ProcessedMaterial processedMaterial = this.hibernateTemplate.get(ProcessedMaterial.class, pid);
		this.hibernateTemplate.delete(processedMaterial);
	}
	
	@Transactional 
	public void updateProcessedMaterial(ProcessedMaterial processedMaterial)
	{
		this.hibernateTemplate.update(processedMaterial);
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
