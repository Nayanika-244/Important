import java.io.*;
import java.util.*;

class ReverseString
{
 String reverseString(String str)
 {
 if(str.length() == 0 || str.length() == 1)
 return str;

int i = 0;
int j=str.length()-1;

char[] cArr = str.toCharArray();

 while(i<=j)
 {
if(cArr[i]!=cArr[j])
{
	char temp = cArr[i];
	cArr[i] = str.charAt(j);
	cArr[j] = temp;
}
i++;
j--;
 }

 return new String(cArr);	
 }

String reverse2(String str)
{
	if(str.length() == 0 || str.length() == 1)
		return str;

	
	
	StringBuilder sb = new StringBuilder();
	for(int i=str.length()-1;i>=0;i--)
	{
sb.append(str.charAt(i));
	}
	return sb.toString();
}
 public static void main(String[] args)
 {
 	Scanner scan = new Scanner(System.in);
 	String str = scan.nextLine();
 	ReverseString s = new ReverseString();
 	System.out.println("Reverse String is "+s.reverse2(str));
 }
}