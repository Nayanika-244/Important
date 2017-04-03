import java.io.*;
import java.util.*;


class Box implements Comparable<Box>
{
	int l;
	int b;
	int h;
	int baseArea;
	public Box(int l,int h,int b)
	{
	this.l = l;
	this.b = b;
	this.h = h;
	this.baseArea = Math.max(l*b,Math.max(b*h,l*h));
	}

	//sort boxes on basis of highest base area


	public int compareTo(Box b2)
	{
	//int baseArea = Math.max(b2.l*b2.b,b2.b*b2.h,b2.h*b2.l);

	//int baseArea1 = Math.max(this.l*this.h,this,b*this.h,this.l*this.b);

	return b2.baseArea - this.baseArea; //descending order
	}

	public static void main(String[] args)
	{
	ArrayList<Box> b = new ArrayList<Box>();
	Box b1 = new Box(1,2,3);
	Box b2 = new Box(3,4,5);
	Box b3 = new Box(1,9,8);
	b.add(b1);
	b.add(b2);
	b.add(b3);

	//Collections.sort(b);
	for(Box item:b)
	{
	System.out.println(item.baseArea);
	}

	System.out.println();

	Collections.sort(b,new Comparator<Box>(){

		public int compare(Box b1,Box b2)
		{
			return b1.compareTo(b2);
		}
	});

	for(Box item:b)
	{
	System.out.println(item.baseArea);
	}
	}
}