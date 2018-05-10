package exception;

import java.util.Scanner;

public class testexception {
	public static void main(String[] args) {
		int[] a = new int[10];
		int index;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		index = in.nextInt();
		try {
			a[index] = 4;
			System.out.println("okay");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("we have catched this exception");
		}
	}
}
