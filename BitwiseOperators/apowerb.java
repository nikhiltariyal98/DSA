package BitwiseOperators;

public class apowerb {
    public static void main(String[] args)
    {
        int base = 3;
        int exponent =6;
        int ans = 1;
        while(exponent>0)
        {
            int oddeven= exponent&1;
            if(oddeven==1)
            {
                ans*=base;
            }
            base*=base;
            exponent>>=1;
        }
        System.out.println(ans);
        
    }
    
}
