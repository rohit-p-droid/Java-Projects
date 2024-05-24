package Controller;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;


public class RawaMaterialDao {
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional 
	public int insert(RawMaterial rawMaterial) 
	{
		Integer i = (Integer) this.hibernateTemplate.save(rawMaterial);
		return i;
	}
	
	
	public RawMaterial getRawMaterial(int id)
	{
		RawMaterial rawMaterial = this.hibernateTemplate.get(RawMaterial.class, id);
		return rawMaterial;
	}
	

	public List<RawMaterial> getAllRawMaterial()
	{
		List<RawMaterial> rawMaterial = this.hibernateTemplate.loadAll(RawMaterial.class);
		return rawMaterial;
	}
	
	@Transactional 
	public void deleteRawMaterial(int id) 
	{
		RawMaterial rawMaterial = this.hibernateTemplate.get(RawMaterial.class, id);
		this.hibernateTemplate.delete(rawMaterial);
	}
	@Transactional 
	public void updateRawMaterial(RawMaterial rawMaterial)
	{
		this.hibernateTemplate.update(rawMaterial);
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
