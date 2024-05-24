package Controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="IssueProcessedLog")

public class IssueProcessedMaterial {
	
	@Id
	private int pIid;
	private String Pname;
	private int Pquantity;
	private String PissuerName;
	private int PitemId;
	private String Pdate;
	private int Pcost;
	private String Punit;
	public int getpIid() {
		return pIid;
	}
	public void setpIid(int pIid) {
		this.pIid = pIid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getPquantity() {
		return Pquantity;
	}
	public void setPquantity(int pquantity) {
		Pquantity = pquantity;
	}
	public String getPissuerName() {
		return PissuerName;
	}
	public void setPissuerName(String pissuerName) {
		PissuerName = pissuerName;
	}
	public int getPitemId() {
		return PitemId;
	}
	public void setPitemId(int pitemId) {
		PitemId = pitemId;
	}
	public String getPdate() {
		return Pdate;
	}
	public void setPdate(String pdate) {
		Pdate = pdate;
	}
	public int getPcost() {
		return Pcost;
	}
	public void setPcost(int pcost) {
		Pcost = pcost;
	}
	public String getPunit() {
		return Punit;
	}
	public void setPunit(String punit) {
		Punit = punit;
	}
	public IssueProcessedMaterial(int pIid, String pname, int pquantity, String pissuerName, int pitemId, String pdate,
			int pcost, String punit) {
		super();
		this.pIid = pIid;
		Pname = pname;
		Pquantity = pquantity;
		PissuerName = pissuerName;
		PitemId = pitemId;
		Pdate = pdate;
		Pcost = pcost;
		Punit = punit;
	}
	public IssueProcessedMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
