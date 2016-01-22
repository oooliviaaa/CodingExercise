package yaolin_small_tests;

public class SlidWindowMax {

	/* 
	 * http://www.shuatiblog.com/blog/2014/07/27/Sliding-Window-Maximum/
	 * The naive approach is using a Heap. This time complexity is O(n*logn). 
	 * However, there is a better way using a (double-ended) queue.
	 * We do not need to keep all numbers. 
	 * For example, suppose numbers in a window of size 4 are (1, 3, -1, 2). 
	 * Obviously, no matter what next numbers are, 1 and -1 are never going to be a maximal as the window moving. 
	 * The queue should look like (3, 2) in this case.
	 */
	public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res  = new int[nums.length - k + 1];
        
    }
}
