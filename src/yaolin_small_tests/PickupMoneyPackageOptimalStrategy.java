package yaolin_small_tests;
/*
 * http://www.geeksforgeeks.org/dynamic-programming-set-31-optimal-strategy-for-a-game/
 * http://ideone.com/3JZdjr
 */

public class PickupMoneyPackageOptimalStrategy {

	public static void main(String[] args) {
		int[] A = new int[]{4,3,7,18,1,8};
		int res = mostAmount(A);
		System.out.println(res);
	}
	
	public static int mostAmount(int[] A) {
		int n = A.length;
		
		int[][] dp = new int[n][n];
		
		int i, j, gap;
		int x, y, z;  // Here x is value of F(i+2, j), y is F(i+1, j-1) and z is F(i, j-2) in above recursive formula
		
		for (gap = 0; gap < n; gap++) {
			for(i = 0, j = gap; j < n; i++, j++) {
				x = (i+2 <= j) ? dp[i+2][j] : 0;
				y = (i+1 <= j-1) ? dp[i+1][j-1] : 0;
				z = (i <= j-2) ? dp[i][j-2] : 0;
				
				dp[i][j] = max( A[i] + min(x, y) , A[j] + min(y, x) );
			}
		}
		return dp[0][n-1];
	}
	
	static int max(int a, int b) {return a > b ? a : b; }
	static int min(int a, int b) {return a < b ? a : b; }
	
}
