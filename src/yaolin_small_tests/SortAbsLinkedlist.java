package yaolin_small_tests;

public class SortAbsLinkedlist {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(-1);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(-4);
		ListNode l5 = new ListNode(6);
		ListNode l6 = new ListNode(10);
		ListNode l7 = new ListNode(-20);
		ListNode l8 = new ListNode(-25);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		
		SortAbsLinkedlist s = new SortAbsLinkedlist();
		ListNode h = s.solution(l1);
		while(h != null) {
			System.out.println(h.val);
			h = h.next;
		}
	}
	
	// posDummy -> -1 -> 3 -> -4 -> 6 -> 10 -> -20 -> -25
	// negDummy
	public ListNode solution(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode posDummy = new ListNode(0);
		ListNode negDummy = new ListNode(0);
		
		posDummy.next = head;
		ListNode m = negDummy;
		
		ListNode l = posDummy;
		ListNode r = head;
		
		while(r != null) {
			if(r.val < 0) {
				m.next = r;
				m = m.next;
				// cut off the pos node from the following neg node
				l.next = r.next;
			}
			else {
				l.next = r;
				l = l.next;
			}
			
			r = r.next;
		}
		// the last neg should cut off from any pos node behind
		m.next = null;
		
		ListNode negHead = reverseLinkedlist(negDummy.next);
		
		negDummy.next.next = posDummy.next;
		
		return negHead;
	}
	
	public ListNode reverseLinkedlist(ListNode head) {
		if(head == null || head.next == null) return head;
		
		ListNode pre = head;
		ListNode cur = head.next;
		pre.next = null;
		
		while(cur != null) {
			
			ListNode next = cur.next;
			cur.next = pre;
			
			pre = cur;
			cur = next;
		}

		return pre;
	}
}
