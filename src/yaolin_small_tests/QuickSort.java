package yaolin_small_tests;

public class QuickSort {

	public void quickSort(int[] input) {
		quickSortHelper(input, 0, input.length-1);
	}
	
	public void quickSortHelper(int[] input, int bg, int ed) {
		if(bg >= ed) return;
		int mid = partition(input, bg, ed);
		quickSortHelper(input, bg, mid-1);
		quickSortHelper(input, mid+1, ed);
	}
	
	public int partition(int[] input, int bg, int ed) {
		int pivot = input[bg];
		int small = bg;
		int big = bg+1;
		while(big <= ed) {
			if(input[big] < pivot) {
				small++;
				swap(input, small, big);
			}
			big++;
		}
		swap(input, bg, small);
		return small;
	}
	
	public void swap(int[] input, int a, int b) {
		int tmp = input[a];
		input[a] = input[b];
		input[b] = tmp;
	}
	
	public static void main(String[] args) {
		int[] input = new int[]{3,7,5,2,1,0,9,8,6};
		QuickSort q = new QuickSort();
		q.quickSort(input);
		for(int i : input) System.out.println(i);
	}
}
