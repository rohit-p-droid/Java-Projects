package Employee;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Employee")
@Component
public class Office {
	
	private int EmpId;
	private String EmpName;
	private String EmpCity;
	private String EmpJob;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String name) {
		EmpName = name;
	}
	public String getEmpCity() {
		return EmpCity;
	}
	public void setEmpCity(String city) {
		EmpCity = city;
	}
	public String getEmpJob() {
		return EmpJob;
	}
	public void setEmpJob(String job) {
		EmpJob = job;
	}
	public Office(int empId, String empName, String empCity, String empJob) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpCity = empCity;
		EmpJob = empJob;
	}
	
	

}
