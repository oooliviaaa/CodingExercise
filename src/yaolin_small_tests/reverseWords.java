package yaolin_small_tests;

import java.util.StringTokenizer;

public class reverseWords {

	public String reverseWords(String s) {
//		StringTokenizer st = new StringTokenizer(s);
//		  String reverse = null;
//		   while (st.hasMoreTokens()) {
//		     reverse = st.nextToken() + " " + reverse;
//		   }
//		 return reverse;
		
		if (s == null || s.length() == 0) return s;
        
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		return sb.toString().trim();
//		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }
	
	public static void main(String[] args) {
		String s = "i can fly";
		reverseWords re = new reverseWords();
		System.out.println(re.reverseWords(s));
	}
}
