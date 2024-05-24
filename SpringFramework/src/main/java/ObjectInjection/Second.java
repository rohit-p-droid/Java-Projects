package ObjectInjection;

public class Second {
	
	private First first;
	
	private String Bhushan2;

	public First getFirst() {
		return first;
	}

	public void setFirst(First first) {
		this.first = first;
	}

	public String getBhushan2() {
		return Bhushan2;
	}

	public void setBhushan2(String bhushan2) {
		Bhushan2 = bhushan2;
	}

	public Second(First first, String bhushan2) {
		super();
		this.first = first;
		Bhushan2 = bhushan2;
	}

	public Second() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Second [first=" + first + ", Bhushan2=" + Bhushan2 + "]";
	}

	
	

}
