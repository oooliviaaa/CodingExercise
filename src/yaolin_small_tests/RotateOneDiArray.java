package yaolin_small_tests;

public class RotateOneDiArray {

	public static void main(String[] args) {
		int[] input = new int[]{1,2,3,
								4,5,6,
								7,8,9,
								10,11,12};
		int[] res = helper(input, 3, 4);
		for(int i : res) System.out.print(i + " ");
	}
	
	public static int[] helper(int[] input, int width, int height) {
		int[] res = new int[input.length];
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				int p = i * width + j;
				int q = j * height + (height - i - 1);
				res[q] = input[p];
			}
		}
		return res;
	}
}
