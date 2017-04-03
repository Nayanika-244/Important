import java.io.*;
import java.util.*;

class SquareRoot
{
	double squareroot(int n)
	{
	if(n<0)
	return -99999;

	if(n==1)
	return 1;
    float mid = n/2;

	while(true)
	{
		if(mid*mid<n)
	mid = mid+1;
	else if(mid*mid>n)
	mid = mid-1;

	if(mid*mid-n < 0.0001)
		break;
	
	}
	return mid;
	}

	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);

	int input = scan.nextInt();

	SquareRoot sq = new SquareRoot();
	System.out.println(sq.squareroot(input));
	}
}