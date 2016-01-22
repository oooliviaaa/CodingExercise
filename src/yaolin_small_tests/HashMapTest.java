package yaolin_small_tests;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("yaolin", "haha");
		hm.put("jilong", "xixi");
		String res = hm.get("mengfei");
		System.out.println(res);   // null, not exception!!!
		
		int size = hm.size();
		System.out.println(size);
	}
	
	public static void perfectWayToChangeValueInHashMap(String[] words) {
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		
		for(String w : words) {
			ArrayList<String> val = hm.get(w);
			if(w == null) {
				val = new ArrayList<String>();
			}
			val.add("new value");
			hm.put(w, val);
		}
	}
}
