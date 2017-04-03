import java.io.*;
import java.util.*;


class rotate
{

int[][] rotatematrix(int[][] matrix)
{


int m = matrix.length;
int n = matrix[0].length;

if(m==0|| n==0)
System.out.println("number of rows or columns is 0");



int[][] mnew = new int[n][m];
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
mnew[j][m-1-i] = matrix[i][j];
	}
}
return mnew;
}
	



public static void main(String[] args)
{
	int[][] m = new int[][]{{1,2,3,5},{4,5,6,8},{7,8,9,33}};
	rotate r = new rotate();
	int[][] mnew = r.rotatematrix(m);

	for(int i=0;i<mnew.length;i++){
	for(int j=0;j<mnew[0].length;j++)
	{
System.out.print(mnew[i][j] +" ");
	}
	System.out.println();
	}
}
}