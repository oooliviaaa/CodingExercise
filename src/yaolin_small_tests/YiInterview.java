package yaolin_small_tests;

import java.util.ArrayList;

public class YiInterview {

	public static void main(String[] args) {
		String s = "011*1*";
		YiInterview y = new YiInterview();
		ArrayList<String> res = y.solution(s);
		for(String r : res) {
			System.out.println(r);
		}
	}
	
	public ArrayList<String> solution(String s){
	    char[] sArray = s.toCharArray();
	    ArrayList<String> result = new ArrayList<String>();
	    StringBuilder temp = new StringBuilder();
	    helper(0, sArray, result, temp);
		return result;
	}

	private void helper(int index, char[] sArray, ArrayList<String> result, StringBuilder temp) {
	    if(index == sArray.length) {
	        result.add(new String(temp));
	        return;
	    }
	    if(sArray[index]=='0' || sArray[index]=='1') {
	        temp.append(sArray[index]);
	        helper(index+1, sArray, result, temp);
	    } else {
	        temp.append("0");
	        helper(index+1, sArray, result, temp);
	        temp.setLength(temp.length()-1);
	        temp.append("1");
	        helper(index+1, sArray, result, temp);   
	    }
	}
}

