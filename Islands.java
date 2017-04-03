import java.io.*

import java.util.*;


class Islands


{

	private static final offsets = { -1,0,1};
	boolean isNeighbour(int[][]matrix,int i,int j)
	{
		if(i>=0 && i<m && j>=0 && j<n)
			return true;

		return false;
	}

	void doDFS(int[][] matrix, boolean[][] visited, int i,int j)
	{
	if(visited[i][j])
		return;


	visited = true;

	for(int a=0;a<offset.length;a++)
	{
		for(int b=0;b<offset[0].length;b++)
		{
			if(i==0 && j==0)
				continue;

			if(isNeighbour(matrix,i+a,j+b) && matrix[i+a][j+b] == 1)
				doDFS(matrix,visited,i+a,j+b);
		}
	}
	}
	int findIslandCount(int[][] matrix)
	{
	if(matrix == null| matrix.length == 0)
	return 0;

	int m = matrix.length;
	int n = matrix[0].length;

	boolean[][] visited = new boolean[m][n];

	for(int i =0;i<m;i++)
	{
	for(int j=0;j<n;j++)
	{
	boolean[i][j] = false;
	}
	}

	int count = 0;
	for(int i=0;i<m;i++)
	{
	for(int j=0;j<n;j++)
	{
	if(matrix[i][j] == 1 && !visited[i][j])
	{
	count++;
	doDFS(matrix,visited,i,j);
	}
	}
	}
	rteurn count;
	}
}