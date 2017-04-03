import java.io.*;
import java.util.*;

class MaxContiguous
{

int findMaxContiguousSum(int[] arr)
{
	if(arr.length == 0)
		return 0;

	if(arr.length == 1)
		return (arr[0]>0)?arr[0]:0;

	int globalMax = 0;
	int tempMax = 0;

	for(int i =0;i<arr.length;i++)
	{

		tempMax +=arr[i];

		if(tempMax < 0)
			tempMax = 0;

		if(tempMax > globalMax)
			globalMax = tempMax;
	}

	return globalMax;

}

public static void main(String[] args)
{
	MaxContiguous mx = new MaxContiguous();
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	int arr[] = new int[size];
	for(int i=0;i<size;i++)
		arr[i]=scan.nextInt();
 // int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
	System.out.println(mx.findMaxContiguousSum(arr));
}

}