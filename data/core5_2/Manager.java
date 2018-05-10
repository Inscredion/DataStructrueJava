package core5_2;

public class Manager extends Employee{
	private double bonus;
	
	public Manager(String n,double s,int year,int month,int day) {
		super(n, s, year, month, day);
		bonus = 0;// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary();
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public boolean equals(Object otherobject) {
		if(!super.equals(otherobject))	return false;
		Manager other = (Manager) otherobject;
		return bonus == other.bonus;
	}
	
	public int hashcode() {
		return super.hashcode()+17*new Double(bonus).hashCode();
	}
	
	public String toString() {
		return super.toString()+"[bonus="+bonus+"]";
	}
}
