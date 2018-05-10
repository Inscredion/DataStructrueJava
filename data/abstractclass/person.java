package abstractclass;

public abstract class person {
	public abstract String getDescripton();
	public abstract int gethash();
	
	private String name;
	
	public person(String n) {
		name = n;// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	
}
