package yaolin_small_tests;

import java.util.LinkedList;
import java.util.List;


public class mergeKSortLists {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {
        if (lists.size() == 0) {
            return null;
        }
        return mergeHelper(lists, 0, lists.size() - 1);
    }
    
    private ListNode mergeHelper(List<ListNode> lists, int start, int end) {
        if (start == end) {
            return lists.get(start);
        }
        
        int mid = start + (end - start) / 2;
        ListNode left = mergeHelper(lists, start, mid);
        ListNode right = mergeHelper(lists, mid + 1, end);
        return mergeTwoLists(left, right);
    }
    
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        
        return dummy.next;
    }
    
    
    public static void main(String[] args) {
    	mergeKSortLists ms = new mergeKSortLists();
    	List<ListNode> lists = new LinkedList<ListNode>();
    	ListNode n1_1 = new ListNode(1);
    	ListNode n1_2 = new ListNode(3);
    	ListNode n1_3 = new ListNode(5);
    	ListNode n1_4 = new ListNode(7);
    	n1_1.next = n1_2; n1_2.next = n1_3; n1_3.next = n1_4; 
    	
    	ListNode n2_1 = new ListNode(2);
    	ListNode n2_2 = new ListNode(22);
    	ListNode n2_3 = new ListNode(23);
    	ListNode n2_4 = new ListNode(24);
    	n2_1.next = n2_2; n2_2.next = n2_3; n2_3.next = n2_4; 
    	
    	ListNode n3_1 = new ListNode(-12);
    	ListNode n3_2 = new ListNode(4);
    	ListNode n3_3 = new ListNode(6);
    	ListNode n3_4 = new ListNode(8);
    	n3_1.next = n3_2; n3_2.next = n3_3; n3_3.next = n3_4; 
    	
    	lists.add(n1_1);lists.add(null);lists.add(n2_1);lists.add(n3_1);
    	
    	ListNode res = ms.mergeKLists(lists);
    	ListNode dummy = res;
    	while(dummy != null) {
    		System.out.println(dummy.val);
    		dummy = dummy.next;
    	}
    	
    }
}
