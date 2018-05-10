package ArrayList;

import java.util.ArrayList;

public class arraylisttest {
	public static void main(String[] args) {
		ArrayList<Employee> staff = new ArrayList<>();
		
		staff.add(new Employee("carl cracker", 75000, 1987, 12, 15));
		staff.add(new Employee("harry hacker", 50000, 1989, 10, 1));
		staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));
		
		for (Employee e:staff)
			e.raiseSalary(5);
		
		for (Employee e:staff)
			System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireday="+e.getHireday());
		
	}
}
