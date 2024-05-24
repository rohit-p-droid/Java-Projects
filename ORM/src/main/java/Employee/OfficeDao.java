package Employee;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import PracticeORM.Student;

public class OfficeDao {

	private HibernateTemplate ht;
	
	@Transactional
	public int insert(Office office)
	{
		Integer i = (Integer) this.ht.save("office");
		return i;
	}
	
	public Office getEmployee(int EmpId)
	{
		Office office = this.ht.get(Office.class, EmpId);
		return office;
	}
	
	public List<Office>getAllEmp()
	{
		List<Office> office = this.ht.loadAll(Office.class);
		return office;
	}

	@Transactional
	public void deleteEmp(int EmpId)
	{
		Office office = this.ht.get(Office.class, EmpId);
		this.ht.delete(office);
	}
	
	public void updateEmp(Office office)
	{
		this.ht.update(office);
	}
		
	public HibernateTemplate getHibernateTemplate() 
	{
		return ht;
	}
		
	public void setHibernateTemplate(HibernateTemplate ht) 
	{
		this.ht = ht;
	}
	
	
	
}
