package BitwiseOperators;

public class xorbetween2numbers {
    public static void main(String[] args)
    {
        int a = 3;
        int b =8;
        int ans=0;
        ans =find_ans(2)^find_ans(8);

        System.out.println(ans);
    }
    public static int find_ans(int b)
    {
        int a=b;
        int ans = 0;
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

        return ans;
    }
    
}
