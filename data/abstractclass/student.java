package abstractclass;

public class student extends person{
	private String major;
	
	public student(String n,String m) {
		super(n);// TODO Auto-generated constructor stub
		major = m;
	}
	
	@Override
	public String getDescripton() {
		// TODO Auto-generated method stub
		return "a student named " +getName()+" and he is majored in "+major;
	} 
	
	@Override
	public int gethash() {
		// TODO Auto-generated method stub
		return getName().hashCode()+major.hashCode();
	}
}
