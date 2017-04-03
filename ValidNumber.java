/*Validate if a given string is numeric.

Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.*/
import java.io.*;
import java.util.*;

class ValidNumber

{
	
	boolean findValidNumber(String s)
	 {
         
       s = s.trim();
        
        if(s.length() == 0 || s == null)
			return false;

		//char[] c = s.toCharArray();

		if(s.length() == 1)
		{
			if(Character.isDigit(s.charAt(0)))
			    return true;
			else{

				if(s.charAt(0) == '.')
			    	return false;
			}
		}

        //e10 or 10e should be false
        // if(s.length() == 2)
        // {
        // 	if(!Character.isDigit(s.charAt(0)) && s.charAt(0) != '.' || (s.charAt(1) == '.'))
        //     	return false;
            
        //     else if(s.charAt(0) == '.' && Character.isDigit(s.charAt(1)))
        //     	return true;

        //     return true;

        
       	// }
		for(int i=0;i<s.length();i++)
		{
		    
			if(Character.isDigit(s.charAt(i)))
				continue;

			else if(s.charAt(i) == '.' || s.charAt(i) == 'e')
			{
			    if(i+1<s.length()){
				    if(Character.isDigit(s.charAt(i+1)))
					    continue;
			    }
			    else
			        return false;
			}

			else
				return false;

		}
		return true;
        

		
	}

	public static void main(String[] args)
	{
		ValidNumber v = new ValidNumber();
        
		Scanner scan1 = new Scanner(System.in);
		
        
		String s = scan1.next();
        
		System.out.println(s);
		boolean result = v.findValidNumber(s);

		System.out.println(result);
	}


}