package Practice;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import Practice.Demo;

public class DemoDao {
	
	private HibernateTemplate ht;
	
	@Transactional //for making transaction with database like insert, delete, update
	public int insert(Demo demo) {
	// insert
	Integer i = (Integer) this.ht.save(demo);
	return i;
	}
	// get the single data(object)
	public Demo getStudent(String username) {
	Demo demo = this.ht.get(Demo.class, username);
	return demo;
	}
	// get all students(all rows)
	public List<Demo> getAllStudents() {
	List<Demo> demo = this.ht.loadAll(Demo.class);
	return demo;
	}

}
