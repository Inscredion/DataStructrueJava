package selectsort;
public class testsort {
	public static void main(String[] args) {
		int[] arr = {2,12,1,45,5,23,34,13,44,390};
		for(int e : arr)
			System.out.print(e+" ");
		System.out.println(" ");
		
		int tmp;	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;	
				}
			}		
		}
		
		for(int a:arr)
			System.out.print(a+" ");
	}
}
