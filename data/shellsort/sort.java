package shellsort;

public class sort {
	public sort(int[] array) {
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
