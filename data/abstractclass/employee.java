package abstractclass;
import java.util.*;

public class employee extends person {
	private double salary;
	private Date hireday;
	
	public employee(String n,double s,int year,int month,int day) {
		super(n);
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
		hireday = calendar.getTime();// TODO Auto-generated constructor stub
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireday() {
		return hireday;
	}
	
	@Override
	public String getDescripton() {
		// TODO Auto-generated method stub
		return String.format("an employee with a salary of $.2f",salary)+hireday.toString();
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary*byPercent/100;
		salary += raise;
	}
	
	@Override
	public int gethash() {
		// TODO Auto-generated method stub
		return getName().hashCode()+new Double(salary).hashCode()+hireday.hashCode();
	}
}
