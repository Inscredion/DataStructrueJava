package inheritance;

public class ManagerTest {
	public static void main(String[] args) {
		Manager boss = new Manager("zhangchi", 8000, 1995, 12, 24);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("fengcunjing", 5000, 1973, 5, 23);
		staff[2] = new Employee("sadjf", 5034, 1988, 4, 31);
		for (Employee e:staff)
			System.out.println("name = "+e.getName()+" "+e.getSalary()+" "+e.getHireDay());
		System.out.println(boss.getSalary()+" "+boss.getHireDay()+" "+boss.getName());
 	}
}
