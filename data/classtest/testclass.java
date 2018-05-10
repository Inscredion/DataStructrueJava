package classtest;

import java.util.Date;
import java.util.GregorianCalendar;

public class testclass {
	public static void main(String[] args) {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar(1977,11,4);
		date = calendar.getTime();
		
		Employee zc = new Employee("zhangchi", 5000);
		
		Class em = zc.getClass();
		
		out(em.getSimpleName());
		
		Class e = date.getClass();
		out(e.getName());
		
		
		String classname = "java.util.Date";
		;
	}
	
	public static void out(String s) {
		System.out.println(s);
	}
}
