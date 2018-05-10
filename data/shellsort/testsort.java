package shellsort;
import java.util.*;

public class testsort {
	public static void main(String[] args) {
		int []arr ={1,4,2,7,9,8,3,6};
	    sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void sort(int[] array) {
		for(int gap = array.length/2 ;gap > 0;gap/=2) {
			for(int i = gap;i<array.length;i++) {
				int j = i;
				while(j-gap>0 && array[j]<array[j-gap]) {
					swap(array, j-gap, j);
					j -= gap;
				}
			}
		}
	}
	
	public static void swap(int[]array,int i,int j) {
		int k = array[i];
		array[i] = array[j];
		array[j] = k;
	}

}
