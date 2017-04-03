import java.io.*;
import java.util.*;
class ListNode
{
	int val;
	ListNode next;
	public ListNode(int val)
	{
		this.val = val;
	}
}
class FindMaxInRight
{
	void findmaxInRightLL(ListNode head)
	{
		if(head == null)
			return;

		Stack<Integer> st = new Stack<Integer>();

		ListNode iter = head;

		while(iter!=null)
		{
			st.add(iter.val);
			iter = iter.next;

		}

		ListNode reversed = new ListNode(-1);
		ListNode revIter = reversed;

		while(!st.isEmpty())
		{
		int val = st.pop();
		revIter.next = new ListNode(val);
		revIter = revIter.next;

		}

		int maxVal = -111;
		reversed = reversed.next; //-1 was dummy node so iterate one step forward
		Stack<Integer> resultStack = new Stack<Integer>();

		while(reversed != null)
		{

			resultStack.add(maxVal);

			if(reversed.val>maxVal)
				maxVal = reversed.val;

			reversed = reversed.next;

		}

		while(!resultStack.isEmpty())
			System.out.println(resultStack.pop());
	}

	public static void main(String[] args)
	{
		FindMaxInRight fm = new FindMaxInRight();
		ListNode head = new ListNode(5);
		head.next = new ListNode(6);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(9);
		head.next.next.next.next.next = new ListNode(2);
		fm.findmaxInRightLL(head);
	}
}