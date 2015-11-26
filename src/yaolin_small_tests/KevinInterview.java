package yaolin_small_tests;

import java.util.Stack;

public class KevinInterview {

	
//	1. merge two sorted lists

	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int val) {
	        this.val = val;
	        this.next = null;
	    }
	}


	private ListNode mergeTwoLists(ListNode list1, ListNode list2) {

	ListNode result = new ListNode(0);
	ListNode dummy = result;
	while (list1 != null || list2 != null)
	{

	    if (list1.val <= list2.val)
	    {
	     result.next = list1;
	     list1 = list1.next;
	    }
	    else
	    {
	     result.next = list2;
	     list2 = list2.next;
	    }
	    result = result.next;
	}

	if(list1 != null)
	{    
	    result.next = list1;
	}

	if(list2 != null)
	{    
	    result.next = list2;
	}

	  return dummy.next; 
	}





//	2. 2 stacks —> a queue
//	new: [3, 
//	old: [2,
//	1

	public class Queue<Object>{
	    Stack<Object> StackNew = new Stack<Object>();
	    Stack<Object> StackOld = new Stack<Object>();
	    
	    public void add(Object o){
	    
	    StackNew.push (o);
	    
	    }

	    public Object poll(){
	    if (StackOld.isEmpty())
	    {
	    while (!StackNew.isEmpty())
	    {
	    StackOld.push(StackNew.pop());
	    }
	    }
	    return StackOld.pop();
	    
	    }
	}



//	3. shell script
//	kill a running process, whose name is 'abc'
//
//	ps|grep 'abc'|kill 





}
