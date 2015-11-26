package yaolin_small_tests;

import java.util.ArrayList;

public class test1 {

	public static void main(String args[]){
		ArrayList<String> ss = new ArrayList<String>();
		for (int i = 0; i < 10; i++){
			ss.add(String.valueOf(i));
		}
		String s = ss.remove(0);
		System.out.println(s);
		
	}
}
