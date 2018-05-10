package core5_2;

public class EqualsTest {
	public static void main(String[] args) {
		Employee alice1 = new Employee("alice adams", 75000, 1987, 12, 15);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("alice adams", 75000, 1987, 12, 15);
		Employee bob = new Employee("bob brandson", 50000, 1989, 10, 1);
		
		System.out.println("alice1 == alice2"+(alice1==alice2));
		System.out.println("alice1 == alice3"+(alice1==alice3));
		System.out.println("alice1.equals(alice2)"+alice1.equals(alice2));
		System.out.println("alice1.equals(alice3)"+alice1.equals(alice3));
		System.out.println("alice1.equals(bob)"+alice1.equals(bob));
		
		System.out.println("bob.toString()"+bob.toString());
		
		Manager carl = new Manager("carl cracker", 80000, 1987, 12, 15);
		Manager boss = new Manager("carl cracker", 80000, 1987, 12, 15);
		 
		boss.setBonus(5000);
		System.out.println("boss.toString()"+boss.toString());
		System.out.println("carl.equals(boss)"+carl.equals(boss));
		System.out.println("alice1.hashcode()"+alice1.hashcode());
		System.out.println("alice3.hashcode()"+alice3.hashcode());
		
		System.out.println("carl.hashcode()"+carl.hashcode());
		System.out.println("boss.hashcode()"+boss.hashcode());
		
	}
}
