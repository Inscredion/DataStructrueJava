package Integer;

import java.util.ArrayList;

public class IntegerTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(Integer.valueOf(2));
		
		for(Integer i:list)
			System.out.println(i.intValue());
		
		int a = 3;
		String s = "3";
		int x = Integer.parseInt(s);
		Integer b = 3;
		if(b.equals(a))
			System.out.println("true");
		else {
			System.out.println("false");
		}
		System.out.println(x);
		
	}
}
