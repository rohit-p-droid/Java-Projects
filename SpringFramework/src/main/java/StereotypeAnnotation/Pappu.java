package StereotypeAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Pappu {
	
	private int id;
	private String name;
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
	public Pappu(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Pappu() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pappu [id=" + id + ", name=" + name + "]";
	}
	
	

}
