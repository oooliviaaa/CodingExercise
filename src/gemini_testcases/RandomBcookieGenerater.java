package gemini_testcases;

import java.util.Random;

public class RandomBcookieGenerater {

	static final String AB = "0123456789abcdefghijklmnopqrstuvwxyz";
	static Random rnd = new Random();

	String randomString( int len ){
	   StringBuilder sb = new StringBuilder( len );
	   for( int i = 0; i < len; i++ ) 
	      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
	   return sb.toString();
	}
	
	public static void main(String[] args) {
		RandomBcookieGenerater rb = new RandomBcookieGenerater();
		String res = rb.randomString(13);
		System.out.println(res);
	}
}
