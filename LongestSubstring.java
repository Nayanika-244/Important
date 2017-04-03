import java.io.*;
import java.util.*;


class LongestSubstring
{
	String find(String str)
	{

	StringBuilder newstr = new StringBuilder();
	for(int i =0;i<str.length();i++)
	{
	for(int j =0;j<str.length()-1;j++)
	{
	if(str.charAt(i) == str.charAt(j) && i!=j)
	{
		newstr = new StringBuilder();
	}
		newstr.append(str.charAt(i));
	}
	}

	return newstr.toString();
	}

	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();

	LongestSubstring ls = new LongestSubstring();
	System.out.println("Result "+ls.find(str));
	}
}