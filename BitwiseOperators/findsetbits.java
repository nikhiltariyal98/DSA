package BitwiseOperators;

public class findsetbits {
    public static void main(String[] args)
    {
        int a = 14;
        int ans = 0;
        while(a>0)
        {
            int oddeven = a&1;
            if(oddeven==1)
            {
                ans++;
            }
            a>>=1;
        }
        System.out.println(ans);
    }
    
}
