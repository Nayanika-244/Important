import java.io.*;
import java.util.*;


class MaxDisjointPairSum
{
	int findMaxSum(Integer[] arr,int K)
	{

	if(arr.length == 0 || arr.length == 1)
		return 0;
	if(arr.length == 2)
	{
		if(Math.abs(arr[0] - arr[1]) < K)
			return arr[0]+arr[1];
		else 
			return 0;
	}
	List<Integer> arrList = Arrays.asList(arr);
	Collections.sort(arrList);
	Integer[] newarr = arrList.toArray(new Integer[arrList.size()]);


	int maxSum = 0;
	for(int i=newarr.length-1;i>0;i--)
	{

		if(newarr[i] - newarr[i-1] <K)
		{
			maxSum += newarr[i];
			maxSum += newarr[i-1];
			i--;
		}
	}
	return maxSum;

	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int K  = scan.nextInt();

		Integer[] arr = new Integer[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}

		MaxDisjointPairSum md = new MaxDisjointPairSum();
		System.out.println(md.findMaxSum(arr,K));
	}
}