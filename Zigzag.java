import java.io.*;
import java.util.*;


class ZigZag
{
	ArrayList<Integer> zigzagorder(int[][] input)
	{
	if(input.length == 0 || input == null)
	{
	return null;
	}
	ArrayList<Integer> result = new ArrayList<Integer>();
	boolean rightToLeft = true;
	for(int i=0;i<input.length;i++)
	{
		if(rightToLeft)
		{
		for(int j=input[0].length-1;j>=0;j--)
		result.add(input[i][j]);
		rightToLeft = false;
		}
		else
		{
		for(int j=0;j<input[0].length;j++)
		result.add(input[i][j]);
		rightToLeft = true;
		}
	}
	return result;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		int[][] input = new int[][]{{1,2,3},{6,5,4},{7,8,9}};
		ZigZag z = new ZigZag();
		ArrayList<Integer> result = z.zigzagorder(input);
		System.out.println(result.size());
		for(int item:result)
			System.out.println(item);

	}
}