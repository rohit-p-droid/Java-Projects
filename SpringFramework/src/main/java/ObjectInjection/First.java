package ObjectInjection;

public class First {
	
	private String Bhushan;

	public String getBhushan() {
		return Bhushan;
	}

	public void setBhushan(String bhushan) {
		Bhushan = bhushan;
	}

	public First(String bhushan) {
		super();
		Bhushan = bhushan;
	}

	public First() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "First [Bhushan=" + Bhushan + "]";
	}

	
	
	
}
