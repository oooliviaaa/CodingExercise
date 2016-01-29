package yaolin_small_tests;

public class LinkedlistCircle {

	public boolean hasCycle(ListNode head) {
		ListNode f1, f2; // two node pointers which traverse list at different rates f1 at twice the rate as f2
        f1 = head.next; f2 = head;
        boolean set = false;
   while (f1 != f2) {
       
       f1 = f1.next;
       if (f2 == null) return false;
        if (set) 
         f2 = f2.next;
                      set = !set;
   }
   return true;

//		ListNode fast = head;
//		ListNode slow = head;
//	      
//	    while(fast != null && fast.next != null){
//	        fast = fast.next.next;
//	        slow = slow.next;
//	        if(fast == slow) return true;
//	    }
//	    return false;
	    
	}
	
	
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
//		l6.next = l3;


		LinkedlistCircle c =new LinkedlistCircle();
		boolean result = c.hasCycle(l1);
		System.out.println(Boolean.toString(result));
		
	}
}
