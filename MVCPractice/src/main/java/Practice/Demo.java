package Practice;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name="DemoLogin")
@Component 
public class Demo {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Demo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
