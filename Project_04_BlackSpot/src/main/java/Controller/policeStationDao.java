package Controller;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class policeStationDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional 
	public int insert(policeStation PoliceStation) 
	{
		Integer i = (Integer) this.hibernateTemplate.save(PoliceStation);
		return i;
	}
	
	
	public policeStation getPoliceStation(int id)
	{
		policeStation issueProcessedMaterial = this.hibernateTemplate.get(policeStation.class, id);
		return issueProcessedMaterial;
	}
	

	public List<policeStation> getAllPoliceStations()
	{
		List<policeStation> PoliceStation = this.hibernateTemplate.loadAll(policeStation.class);
		return PoliceStation;
	}
	
	@Transactional 
	public void deletePoliceStation(int id) 
	{
		policeStation PoliceStation = this.hibernateTemplate.get(policeStation.class, id);
		this.hibernateTemplate.delete(PoliceStation);
	}
	@Transactional 
	public void updatePoliceStation(policeStation PoliceStation)
	{
		this.hibernateTemplate.update(PoliceStation);
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
