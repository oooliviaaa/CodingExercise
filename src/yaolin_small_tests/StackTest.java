package yaolin_small_tests;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack s = new Stack();
		Object a = s.push("asd");
		Object b = s.push("qwe");
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);
		
	}
}
