package newhash;
import java.math.*;

public class hashtable {
	private static hash[] arr;
	
	public hashtable() {
		arr = new hash[100];
	}
	
	public hashtable(int maxsize) {
		arr = new hash[maxsize];
	}
	
	public void insert(hash h) {		//开放地址法
		String key = h.getKey();
		int hashvalue = hashcode(key);
		while(arr[hashvalue]!=null && arr[hashvalue].getName()!=null) {
			++hashvalue;
			hashvalue %= arr.length;
		}
		arr[hashvalue] = h;
	}
	  
	public hash find(String key) {
		int hashvalue = hashcode(key);
		while(arr[hashvalue]!=null) {
			if(arr[hashvalue].getKey().equals(key)) {
				return arr[hashvalue];
			}
			++hashvalue;
			hashvalue %= arr.length;
		}
		return null;
	}
	
	public static int hashcode(String key) {
		BigInteger hashvalue = new BigInteger("0");
		BigInteger pow27 = new BigInteger("1");
		for(int i = key.length()-1;i>=0;i--) {
			int letter = key.charAt(i)-96; 
			BigInteger Letter = new BigInteger(String.valueOf(letter));
			hashvalue = hashvalue.add(Letter.multiply(pow27));
			pow27 = pow27.multiply(new BigInteger(String.valueOf(27)));
		}
		return hashvalue.mod(new BigInteger(String.valueOf(100))).intValue();
	}
	
	public static void delete(String key) {
		  int hashvalue = hashcode(key);
		  while(arr[hashvalue]!=null) {
			  if(arr[hashvalue].getKey().equals(key)) {
				arr[hashvalue].setName(null);
			  }
			  ++hashvalue;
			  hashvalue %= arr.length;
		  }
		  return;
	}
}
