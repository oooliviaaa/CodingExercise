package yaolin_small_tests;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class smaill {

	public static void main(String[] args) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		formatter.setTimeZone(TimeZone.getTimeZone("PST"));
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String date = formatter.format(cal.getTime());
        System.out.println(date);
	}
	
}
