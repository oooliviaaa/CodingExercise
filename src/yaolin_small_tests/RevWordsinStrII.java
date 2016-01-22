package yaolin_small_tests;


public class RevWordsinStrII {
	
	// http://hzhou.me/LeetCode/LeetCode-Reverse-Words-in-a-String-II.html
	public void reverseWords(char[] s) {
		if (s == null || s.length == 0) {
            return;
        }
		
		int p = s.length-1;
		while(!Character.isLetter(s[p]) && !Character.isDigit(s[p])) p--;
		
        arrayReverse(s, 0, p);
        for (int i = 0; i < s.length - 1; ) {
            int j = i + 1;
            while (j < s.length && s[j] != ' ' && (Character.isLetter(s[j]) || Character.isDigit(s[j]))) {
                j++;
            }
            arrayReverse(s, i, j - 1);
            i = j + 1;
        }
	}
	
	public void arrayReverse(char[] s, int start, int end) {
        if (s == null || s.length == 0 || start >= end) {
            return;
        }
        char tmp;
        for (int i = start; i <= (end + start) / 2; i++) {
            tmp = s[i];
            s[i] = s[end + start - i];
            s[end + start - i] = tmp;
        }
    }
	
	public static void main(String[] args) {
		char[] s = new char[]{'h', 'i', '!'};  //{'h', 'i', '!'}; //{'i', ' ', 'c', 'a', 'n', ' ', 'f', 'l', 'y', '!'};
		RevWordsinStrII ins = new RevWordsinStrII();
		ins.reverseWords(s);
		for(char c : s) {
			System.out.println(c);
		}
	}
}
