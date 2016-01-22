package gemini_testcases;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
        String value = sdf.format(date);
		System.out.println("conversionTimestamp = " + value);
		
		cal.add(Calendar.DATE, -1);
		date = cal.getTime();
		value = sdf.format(date);
		System.out.println("Yesterday's date = "+ value);
	}
}
