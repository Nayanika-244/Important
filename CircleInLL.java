import java.io.*;
import java.util.*;

class Node
{
	int value;
	Node next;
	public Node(int value)
	{
	this.value = value;
	next = null;
	}
}

class CicleInLL
{
	Node loopFinder(Node head)
	{
	//use two pointers - fast and slow. slow moves to next item and fast moves to next of next element.


	Node slow = head;
	Node fast = head;

	while(fast!=slow)
	{
		fast = fast.next.next;
		slow = slow.next;

		if(fast == null)
			return null;
	}

	return fast;
	}

	public static void main(String[] args)
	{
		CicleInLL cll = new CicleInLL();
		Node head = new Node(8);
		Node a = new Node(7);
		Node b = new Node(4);
		Node c = new Node(12);
		a.next = b;
		b.next = c;
		Node d = b;
		c.next = d;
		
		Node result = cll.loopFinder(head);
		System.out.println(result.value);
	}
}