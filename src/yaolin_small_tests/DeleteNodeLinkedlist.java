package yaolin_small_tests;

public class DeleteNodeLinkedlist {

	public void deleteNode(ListNode node) {
		if(node.next==null || node==null )
	        return ;

	    node.val = node.next.val;
	    node.next = node.next.next;
		// change this node to the same with the next node, and then delete the next node
	}
}
