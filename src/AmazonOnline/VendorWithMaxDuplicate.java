package AmazonOnline;

import java.util.ArrayList;
import java.util.HashMap;

public class VendorWithMaxDuplicate {

	
	public static ArrayList<String> getVendorWithMaxDup(String[] items) {
		ArrayList<String> res = new ArrayList<String>();
		
		int len = items.length;
		String[] vendors = new String[len];
		String[] products = new String[len];
		HashMap<String, Integer> id = new HashMap<>();
		int count = 0;
		for(int i = 0; i < len; i++) {
			String item = items[i];
			String vendor = item.substring(0, item.indexOf(","));
			String product = item.substring(item.indexOf(",")+1);
			vendors[i] = vendor;
			products[i] = product;
			
			if(!id.containsKey(vendor)) id.put(vendor, count++);
		}
	
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		for(int i = 0; i < len; i++) {
			/*** 666666666 ***/
			ArrayList<String> names = hm.get(products[i]);
			if(names == null) {
				names = new ArrayList<>();
			}
			names.add(vendors[i]);
			hm.put(products[i], names);
		}
		
		
		
		return res;
	} 
}
