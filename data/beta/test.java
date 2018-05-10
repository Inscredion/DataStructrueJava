package beta;
import java.util.*;

public class test {
	public static void main(String[] args) {
		String[] words = {"mary","had","a","little","lamb"};
		String middle = ArrayAlg.<String>getMiddle("sdf","adf","adf","rter","xvc","adf");
		
		//int[] arr = {1,4,2,4,2,4,0,45,123,94,949};
		Pair<String> mm = ArrayAlg.minmax(words);
	   // int minvalue = ArrayAlg.min(arr);
		System.out.println("min= "+mm.getFirst());
		System.out.println("max= "+mm.getSecond());
		System.out.println(middle);
		//System.out.println(minvalue);
		
		GregorianCalendar[] birthdays = {
				new GregorianCalendar(1906,Calendar.DECEMBER,9),
				new GregorianCalendar(1815,Calendar.DECEMBER,10),
				new GregorianCalendar(1903,Calendar.DECEMBER,3),
				new GregorianCalendar(1910,Calendar.JUNE,22),
		};
		Pair<GregorianCalendar> ms = ArrayAlg.minmax(birthdays);
		System.out.println("min= "+ms.getFirst());
		System.out.println("max= "+ms.getSecond());
	}
}

class ArrayAlg{
	public  static <T extends Comparable> Pair<T> minmax(T[] a){
		if(a==null && a.length==0)	return null;
		T min = a[0];
		T max = a[0];
		
		for(int i = 1;i<a.length;i++) {
			if(min.compareTo(a[i])>0)
				min = a[i];
			if(max.compareTo(a[i])<0)
				max = a[i];
		}
		return new Pair<>(min,max);
	}
	
	public static <T> T getMiddle(T... a){
		return a[a.length/2];
	}
	
	public static <T extends Comparable> T min(T[] a) {							//最小值泛型算法
		if(a==null && a.length==0)	return null;
		T smallest = a[0];
		for(int i=1 ;i<a.length;i++) {
			if((smallest).compareTo(a[i])>0)	
				smallest = a[i];
		}
		return smallest;
	}
}