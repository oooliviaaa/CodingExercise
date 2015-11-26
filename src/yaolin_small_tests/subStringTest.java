package yaolin_small_tests;

public class subStringTest {

	public static void main(String[] args) {
		String str = "2f6700aaid6087atier1accUSada";
		int aaid = str.indexOf("aaid");
		int atier = str.indexOf("atier");
		System.out.println(aaid + " --- " + atier);
		
		String res = str.substring(aaid+4, atier);
		System.out.println(res);
		
		int over = str.indexOf("cv");
		System.out.println(Integer.toString(over));
		String overflow = str.substring(over);
		System.out.println(overflow);
	}
}
