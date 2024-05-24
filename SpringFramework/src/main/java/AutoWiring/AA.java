package AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;

public class AA {
	
	int one;
	int two;
	public int getOne() {
		return one;
	}
	@Override
	public String toString() {
		return "AA [one=" + one + ", two=" + two + "]";
	}
	public AA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AA(int one, int two) {
		super();
		this.one = one;
		this.two = two;
	}
	public void setOne(int one) {
		this.one = one;
	}
	public int getTwo() {
		return two;
	}
	public void setTwo(int two) {
		this.two = two;
	}
	
	
}
