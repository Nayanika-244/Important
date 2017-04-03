import java.io.*;
import java.util.*;


class ReverseWords
{
	String reverse(String sentence)
	{
	if(sentence.isEmpty())
	return sentence;

	String[] wordArr = sentence.split(" ");
	if(wordArr.length == 1)
	return wordArr[0];
	StringBuilder sb = new StringBuilder();

	for(int i=wordArr.length-1;i>=0;i--)
	{
	sb.append(wordArr[i]);
	sb.append(" ");

	}



	return sb.toString().trim();
	}

	public static void main(String[] rgs)
	{
	Scanner scan = new Scanner(System.in);

	String input = scan.nextLine();
	ReverseWords rw = new ReverseWords();
	System.out.println(rw.reverse(input));
	}
}