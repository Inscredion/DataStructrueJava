package core5_2;
import java.util.*;

public class Employee {
	private String name;
	private double salary;
	private Date hireday;
	
	public Employee(String n,double s,int year,int month,int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);// TODO Auto-generated constructor stub
		hireday = calendar.getTime();
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireday() {
		return hireday;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary*byPercent/100;
		salary += raise;
	}
	
	public boolean equals(Object otherObject) {
		if(this == otherObject)	return true;
		if(otherObject == null)	return false;
		if(getClass()!=otherObject.getClass())	return false;
		Employee other = (Employee) otherObject;
		return Objects.equals(name,other.name) && salary==other.salary && Objects.equals(hireday,other.hireday);
	}
	
	public int hashcode() {
		return Objects.hash(name,salary,hireday);
	}
	
	public String toString() {
		return getClass().getName()+"[name="+name+",salary="+salary+",hireday="+hireday+"]";
	}
}
