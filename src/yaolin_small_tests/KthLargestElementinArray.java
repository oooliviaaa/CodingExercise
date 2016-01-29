package yaolin_small_tests;

public class KthLargestElementinArray {

	public int findKthLargest(int[] nums, int k) {
        if(k < 1 || nums == null || k > nums.length) return 0;
        return getKth(0, nums.length-1, nums, nums.length-k+1);  //nums.length-k+1 from left means No.kth number from right, its index=nums.length-k
    }
	
	public int getKth(int start, int end,int[] num, int k) {
		int pivot = num[end];
		
		int left = start;
		int right = end;
		
		while(true) {
			while(num[left] < pivot && left < right) left++;
			while(num[right] > pivot && left < right) right++;
			if(left >= right) break;
			swap(num, left, right);
		}
		swap(num, left, end);
		
		if(left == k-1) return pivot;
		else if (left < k-1) return getKth(left+1, end, num, k);
		else return getKth(start, left-1, num, k);
	}
	
	public void swap(int[] num, int a, int b) {
		int tmp = num[a];
		num[a] = num[b];
		num[b] = tmp;
	}

}
