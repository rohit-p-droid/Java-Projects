package AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;

public class BB {
	
	@Autowired
	AA a;

	public AA getA() {
		return a;
	}

	public void setA(AA a) {
		this.a = a;
	}

	public BB(AA a) {
		super();
		this.a = a;
	}

	public BB() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BB [a=" + a + "]";
	}
	
	

}
