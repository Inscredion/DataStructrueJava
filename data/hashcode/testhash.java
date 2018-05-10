package hashcode;

public class testhash {
	public static void main(String[] args) {
		String s = "Ok";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(s.hashCode()+" "+sb.hashCode());
		String t = new String("Ok");
		System.out.println(t.hashCode());
		StringBuilder tb = new StringBuilder(t);
		System.out.println(tb.hashCode());
 	}
}
