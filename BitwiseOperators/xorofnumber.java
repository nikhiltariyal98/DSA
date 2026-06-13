package BitwiseOperators;

public class xorofnumber {
    public static void main(String[] args)
    {
        int a =8;
        int ans =0;
        int remainder = a%4;
        if(remainder==0)
        {
            ans = a;
        }
        else if (remainder==1)
        {
            ans = 1;
        }
        else if (remainder==2)
        {
            ans = a+1;
        }
        else
        {
            ans =0;
        }
        System.out.println(ans);
        // we need to calculate xor of 0^1^2^4= 
    }
    
}
