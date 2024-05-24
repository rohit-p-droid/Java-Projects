package Controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="RawMaterialLog")
@Component
public class IssueRawMaterial {
	
	@Id
	private int Iid;
	private String name;
	private int quantity;
	private String issuerName;
	private int itemId;
	private String date;
	private int cost;
	private String unit;
	
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getId() {
		return Iid;
	}
	public void setId(int id) {
		this.Iid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public IssueRawMaterial(int iid, String name, int quantity, String issuerName, int itemId, String date, int cost,
			String unit) {
		super();
		Iid = iid;
		this.name = name;
		this.quantity = quantity;
		this.issuerName = issuerName;
		this.itemId = itemId;
		this.date = date;
		this.cost = cost;
		this.unit = unit;
	}
	public IssueRawMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
