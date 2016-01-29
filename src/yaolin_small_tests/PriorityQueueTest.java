package yaolin_small_tests;

import java.util.Comparator;
import java.util.PriorityQueue;
//StringLengthComparator.java
import java.util.Comparator;

public class PriorityQueueTest{
    public static void main(String[] args) {
        Comparator<String> comparator = new StringLengthComparator();
        PriorityQueue<String> queue = 
            new PriorityQueue<String>(10, comparator);
        queue.add("short");
        queue.add("samee");
        queue.add("very long indeed");
        queue.add("medium");
        while (queue.size() != 0)
        {
            System.out.println(queue.remove());
        }
    }
    ////// output //////
//    short
//    medium
//    very long indeed
}



class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String x, String y) {
        // Assume neither string is null. Real code should
        // probably be more robust
        // You could also just return x.length() - y.length(),
        // which would be more efficient.
    	
        if (x.length() < y.length()){
            return -1;  // if negative, sort as (x, y)
        }
        if (x.length() > y.length()){
            return 1;  // if positive, sort as (y, x)
        }
        return 0;      // if tie, sort as (x, y)
        
//        return x.length() - y.length();
    }
    
    /*
     * 
For the mathematically inclined, the relation that defines the imposed ordering that a given comparator c imposes on a given set of objects S is:

       {(x, y) such that c.compare(x, y) <= 0}.
 
The quotient for this total order is:
       {(x, y) such that c.compare(x, y) == 0}.
 
It follows immediately from the contract for compare that the quotient is an equivalence relation on S, and that the imposed ordering is a total order on S. When we say that the ordering imposed by c on S is consistent with equals, we mean that the quotient for the ordering is the equivalence relation defined by the objects' equals(Object) method(s):
     {(x, y) such that x.equals(y)}. 
Unlike Comparable, a comparator may optionally permit comparison of null arguments, while maintaining the requirements for an equivalence relation.
*/
}
