package yaolin_small_tests;

import java.util.ArrayList;
import java.util.Arrays;

public class test4 {

public static void main(String[] args){
	String str = "aaa,bbb*ccc";
	String[] res = str.split("[,*]");
    System.out.println(Arrays.toString(res));
}
}
