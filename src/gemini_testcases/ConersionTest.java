package gemini_testcases;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class ConersionTest {

	DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

	
	public String convertTimeMilltoString(long timeInMills) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        Date resultdate = new Date(timeInMills);
        String res = sdf.format(resultdate);
        System.out.println("===== Local string time: " + res);
        return res;
    }

    public String convertTimetoQuarter(String time) {
        String mm = time.length() > 2 ? time.substring(time.length() - 2) : time;
        String prefix = time.substring(0, time.length()-2);
        int min = Integer.parseInt(mm);
        if (min >= 0 && min < 15) return prefix + "00";
        else if (min >= 15 && min < 30) return prefix + "15";
        else if (min >= 30 && min < 45) return prefix + "30";
        else if (min >= 45 && min < 60) return prefix + "45";
        
        return "";
    }
    
    public String convertTimetoTimezone(Calendar currentdate, String timezone) throws ParseException {
    	
    	String tmp = currentdate.toString();
    	System.out.println("String calender is :" + tmp );
    	Map<String, String> sherpa = new HashMap<String, String>();

    	
    	Date date = currentdate.getTime();
    	String dateString = sdf.format(date);
    	System.out.println("String date: " + dateString);
    	
    	System.out.println("=======write to Sherpa========");
    	sherpa.put("key1", dateString);
    	
    	System.out.println("=======read from Sherpa========");
    	Date dateBack = sdf.parse(sherpa.get("key1"));
    	System.out.println("Back date: " + dateBack);
    	
    	TimeZone obj = TimeZone.getTimeZone(timezone);
    	sdf.setTimeZone(obj);
    	String UTC = sdf.format(dateBack);
    	System.out.println("Local:: " + date);
    	System.out.println("UTC:: "+ UTC);
    	
		return UTC;
    	
    }
    
    
    
    public static void main(String[] args) throws ParseException {
//    	long timeMill = System.currentTimeMillis();
//    	long timeMill = 1438493612985L;
//    	System.out.println("===== Input timeMill is " +  timeMill);
//    	
    	ConersionTest ct = new ConersionTest();
//    	String timeString = ct.convertTimeMilltoString(timeMill);
//    	System.out.println("String is " +  timeString);
//    	

    	Calendar cal = Calendar.getInstance(); 
    	String UTC = ct.convertTimetoTimezone(cal, "UTC");
    	String quarterString = ct.convertTimetoQuarter(UTC);
    	System.out.println("===== Local quarter is " +  quarterString);    	
    }
    
    
    public String oldConverter(String time) {
    	
    	String HH = time.substring(8, 10);
        String prefix = time.substring(0, 8);
        String mm = time.substring(time.length() - 2);
        int hour = Integer.parseInt(HH);
        if(hour >= 17) hour -= 17;
        else hour += 7;



        Calendar.getInstance().getTimeZone().getID();

        return prefix + Integer.toString(hour) + mm;
    }
    
}
