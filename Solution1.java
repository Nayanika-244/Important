import java.io.*;
import java.util.*;

public class Solution1 {
    public int firstUniqChar(String s) {
        if(s.length() == 0 || s == null)
        return -1;
        
        int[] indexArr = new int[26]; //for all alphabet characters
        for(int i:indexArr)
            i=-1;


        int j=0; 
        char[] charArr = s.toCharArray();
        //HashSet<Character> hset = new HashSet<Character>();
        
        
        
        while(j<charArr.length)
        {
            char c = charArr[j];
          if(indexArr[c-'a'] == -1)
            indexArr[c-'a'] = j ;
          else
            indexArr[c-'a'] = -2;
          j++;
        }

        
        int minIndex = 99999;
        for(j=0; j<indexArr.length; j++)
        {
            if(indexArr[j] == -1)
            {
                if(minIndex > indexArr[j])
                    minIndex = indexArr[j];
            }
        
        }
        if(minIndex == 99999)
            return -1;

       return minIndex; 
        

    }

    public static void main(String[] args)
    {
    Solution1 s = new Solution1();
    System.out.println(s.firstUniqChar("nayanika"));
    }
}