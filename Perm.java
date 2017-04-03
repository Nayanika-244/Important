import java.io.*;
import java.util.*;

class Perm
{
	ArrayList<String> findPerm(String str)
	{
	ArrayList<String> result = new ArrayList<String>();
	if(str == null || str.length() == 0)
		return null;

	findAllPerm(str,0,"",result);
	return result;
	
	}

	void findAllPerm(String str, int index, String prefix,ArrayList<String> result)
	{
	if(index == str.length()){
		
	result.add(prefix);
	return;
	}

	char[] ch = str.toCharArray();
	char s = str.charAt(index);
	//for(char c:ch)
	findAllPerm(str,index+1,prefix+s,result);
	}

	public static void main(String[] args)
	{
	String str = "abc";
	Perm p = new Perm();
	List<String> l = p.findPerm(str);
	for(String s:l)
	System.out.println(s.substring(0,1));
	}
}