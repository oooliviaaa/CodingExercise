package yaolin_small_tests;

public class test6 {

	public static void main(String[] args) {
		String names = "Stream.ufeToDP; Stream. indexToUFE; Stream.dpToReport; Stream.AppsToIndex; Stream.AppsToCOW";
		String[] nameList = names.split(";");
		
		for (String s : nameList) {
			String s_new = s.replaceAll("\\s", "");
			System.out.println("s: " + s + " is transfered to s_new: " + s_new);
		}
		
		
	}
}
