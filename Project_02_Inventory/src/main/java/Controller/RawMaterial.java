package Controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Entity
@Table(name="RawMaterial")
@Component
public class RawMaterial {
	
	
	
	@Id
	
	private int id;
	private String name;
	private int quantity;
	private String unit;
	private int cost;
	
	public static int chId;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public static int getChId() {
		return chId;
	}

	public static void setChId(int chId) {
		RawMaterial.chId = chId;
	}

	public RawMaterial(int id, String name, int quantity, String unit, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
		this.cost = cost;
	}
	public RawMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RawMaterial [id=" + id + ", name=" + name + ", quantity=" + quantity + ", unit=" + unit + ", cost="
				+ cost + "]";
	}
	

}
