package yaolin_small_tests;

public class StringCharArrayTest {

	public static void main(String[] args) {
		
		char[] c = new char[]{'a', 'b', 'c'};
		String s = new String(c);   //!!! the correct way to char[] --> String !!!
		c[1] = 'x';
		String ss = new String(c);
		System.out.println(s);
		System.out.println(ss);
	}
}
