package Controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="ProcessedMaterial")
@Component
public class ProcessedMaterial {
	
	@Id
	private int pid;
	private String pname;
	private int pquantity;
	private String punit;
	private int pcost;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	public String getPunit() {
		return punit;
	}
	public void setPunit(String punit) {
		this.punit = punit;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	public ProcessedMaterial(int pid, String pname, int pquantity, String punit, int pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pquantity = pquantity;
		this.punit = punit;
		this.pcost = pcost;
	}
	public ProcessedMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProcessedMaterial [pid=" + pid + ", pname=" + pname + ", pquantity=" + pquantity + ", punit=" + punit
				+ ", pcost=" + pcost + "]";
	}
	
	

}
