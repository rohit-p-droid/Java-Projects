package PracticeORM;

import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	// inserting the data
	@Transactional //for making transaction with database like insert, delete, update
	public int insert(Student student) {
	// insert
	Integer i = (Integer) this.hibernateTemplate.save(student);
	return i;
	}
	// get the single data(object)
	public Student getStudent(int studentId) {
	Student student = this.hibernateTemplate.get(Student.class, studentId);
	return student;
	}
	// get all students(all rows)
	public List<Student> getAllStudents() {
	List<Student> students = this.hibernateTemplate.loadAll(Student.class);
	return students;
	}
	// deleting the data
	@Transactional //for making transaction with database like insert, delete, update
	public void deleteStudent(int studentId) {
	Student student = this.hibernateTemplate.get(Student.class, studentId);
	this.hibernateTemplate.delete(student);
	}
	// updating data...
	@Transactional //for making transaction with database like insert, delete, update
	public void updateStudent(Student student) {
	this.hibernateTemplate.update(student);
	}
	public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
	}

}
