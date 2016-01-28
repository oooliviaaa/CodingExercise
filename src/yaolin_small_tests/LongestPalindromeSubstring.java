package yaolin_small_tests;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		String s = "asdfghgfjklwertyytrewqqw";
		LongestPalindromeSubstring lps = new LongestPalindromeSubstring();
		String res = lps.longestPalindrome(s);
		System.out.println(res);
	}

	// DP problem
	private String longestPalindrome(String s) {
		int maxLen = 1;  // store the length of longest palindrome
		int palinStart = 0;
		int len = s.length();
		boolean[][] dp = new boolean[len][len];  //dp[i][j], i is substring start index; j is substring end index
		
		// initialize the length == 1 substrings
		for(int i = 0; i < len; i++){
			dp[i][i] = true;
		}
		
		// initialize the length == 2 substrings
		for(int i = 0; i < len-1; i++){
			if(s.charAt(i) == s.charAt(i+1)) {
				dp[i][i+1] = true;
				maxLen = 2;
			}			
		}
		
		// update the rest of the substrings (length == 3, length == 4 ... length == n)
		for(int length = 3; length <= len; length++) {
			for(int p = 0; p <= len - length; p++) {
				int q = p + length - 1;  ///////// need to -1 so the length is
				if(s.charAt(p) == s.charAt(q) && dp[p+1][q-1]){
					dp[p][q] = true;
					maxLen = length;
					palinStart = p;
				}
			}
		}
		System.out.println(maxLen);
		System.out.println(palinStart);
		return s.substring(palinStart, palinStart + maxLen);  //beginIndex -- the begin index, inclusive.
															  //endIndex -- the end index, exclusive.
	}
	
	
}
