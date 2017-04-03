import java.io.*;
import java.util.*;

class MinMax
{
	int[] findMinMax(int[] arr)
	{
		if(arr == null || arr.length == 0)
			return null;


		else if(arr.length == 1)
			return new int[]{arr[0],arr[0]};

		int[] minMax = new int[]{99999,-99999};

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < minMax[0])
				minMax[0] = arr[i];
			if(arr[i] > minMax[1])
				minMax[1] = arr[i];


		}

		return minMax;
	}

	public static void main(String[] args)
	{
		MinMax mx = new MinMax();
		int[] arr = new int[]{2,2,4,5-1,10,-30};
		int[] result = mx.findMinMax(arr);
		System.out.println("min "+result[0]);
		System.out.println("max "+result[1]);
	}
}