package yaolin_small_tests;

import java.util.Arrays;

public class BucketSort {

	public static void sort(int[] A, int maxVal) {
		int[] bucket = new int[maxVal + 1];
		
		for(int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}
		
		for(int j = 0; j < A.length; j++) {
			bucket[A[j]]++;
		}
		
		int index = 0;
		for (int i=0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				A[index++] = i;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] A = {2,6,4,9,5,2,7,7,4,1,0};
		int maxVal = 9;
		System.out.println("Before: " + Arrays.toString(A));
	    sort(A, maxVal);
	    System.out.println("After:  " + Arrays.toString(A));
	}
	
}
