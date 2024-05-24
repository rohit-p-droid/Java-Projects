package Controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Police_Stations")
public class policeStation {
	
	@Id
	private int pid;
	private String pname;
	private String paddr;
	private String pcontact;
	private String pmail;
	private String ppass;
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
	public String getPaddr() {
		return paddr;
	}
	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}
	public String getPcontact() {
		return pcontact;
	}
	public void setPcontact(String pcontact) {
		this.pcontact = pcontact;
	}
	public String getPmail() {
		return pmail;
	}
	public void setPmail(String pmail) {
		this.pmail = pmail;
	}
	public String getPpass() {
		return ppass;
	}
	public void setPpass(String ppass) {
		this.ppass = ppass;
	}
	
	public policeStation(int pid, String pname, String paddr, String pcontact, String pmail, String ppass) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.paddr = paddr;
		this.pcontact = pcontact;
		this.pmail = pmail;
		this.ppass = ppass;
	}
	
	@Override
	public String toString() {
		return "PoliceController [pid=" + pid + ", pname=" + pname + ", paddr=" + paddr + ", pcontact=" + pcontact
				+ ", pmail=" + pmail + ", ppass=" + ppass + "]";
	}
	
	
	

}
