package yaolin_small_tests;

import java.util.LinkedList;
import java.util.List;

public class GuoweiInterview {
	
	public static void main(String[] args) {
		List<ListNode> lists = new LinkedList<ListNode>();
    	ListNode n1 = new ListNode(1);
    	ListNode n2 = new ListNode(2);
    	ListNode n3 = new ListNode(3);
    	ListNode n4 = new ListNode(4);
    	ListNode n5 = new ListNode(5);
    	
    	n1.next = n2;
    	n2.next = n3;
    	n3.next = n4;
    	n4.next = n5;
    	n5.next = n1;
    	
    	ListNode n11 = new ListNode(1);
    	ListNode n12 = new ListNode(2);
    	ListNode n13 = new ListNode(3);
    	ListNode n14 = new ListNode(4);
    	ListNode n15 = new ListNode(5);
    	n11.next = n12;
    	n12.next = n13;
    	n13.next = n14;
    	n14.next = n15;

    	
    	GuoweiInterview g = new GuoweiInterview();
    	boolean res0 = g.hasCycle(null);
    	boolean res1 = g.hasCycle(n1);
    	boolean res2 = g.hasCycle(n11);
    	System.out.println(String.valueOf(res0));
    	System.out.println(String.valueOf(res1));
    	System.out.println(String.valueOf(res2));
    	
    	System.out.println("==============");
    	int[] num = new int[]{1,2,3,4,5,6,7,8,9};
    	
    	
	}
	
	public boolean hasCycle(ListNode head) {
		if(head == null)
	    {
	        return false;
	    }
	    ListNode fast = head.next;
	    ListNode slow = head;
	    while(fast != null && fast.next != null && slow != fast)
	    {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    if(fast == null || fast.next == null)
	    {
	        return false;
	    }
	    if(fast == slow)
	    {
	        return true;
	    }
	    return false;  // fixed after talk
	}
	
	private TreeNode helper(int[] num , int start , int end)
	{
	    int len = num.length;
	    if( start < 0 || start > len - 1|| end < 0 || end > len - 1)
	    {
	        return null;
	    }
	    if(start > end)
	    {
	        return null;
	    }
	    int mid = start + (end - start)/2;
	    TreeNode cur = new TreeNode(num[mid]);
	    cur.left = helper(num , start , mid - 1);
	    cur.right = helper(num , mid + 1 , end);
	    return cur;
	}

	public TreeNode sortedArrayToBST(int[] num){
	    if(num.length == 0)
	    {
	        return null;
	    }
	    return helper(num , 0 , num.length - 1);


	}
	
	private void moveHelper(int n , char source , char target , char standby)
	{
	        if( n <= 0)
	            return ;

	        moveHelper(n - 1 , source , standby , target);
	        moveHelper(n , source , target , standby);
	        System.out.println("move" +String.valueOf(n)+ " from " + String.valueOf(source) + "to " +String.valueOf(target));

	     
	     
	}
	    
	public void move(int n, char A, char B, char C){
	    moveHelper( n , A , C , B);



	}
	
//	4. 
//	table user: | id | email | lastUpdateTime |
//	indexing
//	query: find the 5 most recent updated tuples.
//
//	SELECT *
//	FROM user
//	Order by lastUpdateTime
//	limit 5
}
