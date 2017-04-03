import java.io.*;

class Reverse
{
 public int reverseBits(int n) {
        
        StringBuilder sb = new StringBuilder(Integer.toString(n));
        sb.reverse();
        
        Integer i =  Integer.parseInt(sb.toString());
        return i;
        
    }


    public int reverse(int x) {
        
        int result=0;
        while(x>0)
        {
            int last_digit = x%10;
            System.out.println("last_digit "+last_digit);
            result = result*10 + last_digit;
            System.out.println("result "+result);
            x = x/10;
            
            
        }
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE)
            return 0;
        return result;
    }


    public static void main(String[] args)
    {
    Reverse r = new Reverse();
    int res = r.reverse(-123);
    System.out.println(res);

    }
    }