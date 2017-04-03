import java.io.*;
import java.util.*;

public class NumberOfIslands {
	
	boolean visited[][];
	int row,col;
	int input[][];
	NumberOfIslands(int row, int col,int[][] input)
	{
		this.row = row;
		this.col = col;
		visited = new boolean[row][col];
		for(boolean item[]:visited)
			for(boolean ele:item)
				ele = false;
		this.input = input;
		
	}

	void DFS(int i, int j)
	{
		if(i < row && i >= 0 && j>=0 && j < col)
		{
		if(input[i][j] == 1){
			visited[i][j] = true;
			DFS(i+1,j);
			DFS(i,j+1);
			DFS(i-1,j);
			DFS(i,j-1);
		}}
		else
			return;
		
	}
	int findIslands(int[][] input)
	{
		int count = 0;
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<col;j++)
			{
				
				if(input[i][j] == 1 && visited[i][j] == false)
				{
					DFS(i,j);
					count++;
				}
				
			}
		}
		
		
		
		return count;
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int[][] input = new int[row][col];
		for(int i = 0;i<row;i++)
			for(int j=0;j<col;j++)
				input[i][j] = scan.nextInt();
		NumberOfIslands noi = new NumberOfIslands(row,col,input);
		System.out.println(noi.findIslands(input));
		
	}
}
