package yaolin_small_tests;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("yaolin", "haha");
		hm.put("jilong", "xixi");
		String res = hm.get("mengfei");
		System.out.println(res);   // null
		
		int size = hm.size();
		System.out.println(size);
	}
}
