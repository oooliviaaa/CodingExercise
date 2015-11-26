package yaolin_small_tests;

import java.util.Calendar;

public class test3 {

	public static void main(String[] args) {
		test3 t = new test3();
		int curMin = t.getMinuteOfHour();
		System.out.println(String.valueOf(curMin));
		System.out.println("======================");
		System.out.println(String.valueOf(curMin % 10));
		System.out.println("----------------------");
		System.out.println(String.valueOf(3 % 10));
		
	}
	
	private int getMinuteOfHour() {
        Calendar rightNow = Calendar.getInstance();
        return rightNow.get(Calendar.MINUTE);
    }
}
