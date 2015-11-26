package yaolin_small_tests;

public class SplitTest {

	public static void main(String[] args) {
		String input = "a::b::offers";
		String[] ar = input.split("|");
		for(String a : ar) {
			System.out.println(a);
		}
	}
}
