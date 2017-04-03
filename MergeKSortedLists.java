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

class MergeKSortedLists
{
	ListNode mergeKSortedLists(ArrayList<ListNode> nodes)
	{


		if(node == null)
			return null;

		else if(nodes.size() == 1)
			return nodes.get(0);

		PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>();
		ListNode head = new ListNode(0);
		ListNode iter = head;
		for(int i=0;i<nodes.size();i++)
			heap.offer(nodes.get(i));

		while(!heap.isEmpty())
		{
			ListNode smallest = heap.poll();
			iter.next = smallest;
			iter = iter.next;
			smallest = smallest.next;
			heap.offer(smallest);
		}

		return head.next;

	}
}