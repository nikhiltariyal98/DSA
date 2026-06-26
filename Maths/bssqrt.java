package Maths;

public class bssqrt {
    public static void main(String[] args)
    {
        int b = 39;
        System.out.println(solve(b));
    }
    public static int solve(int a)
    {
        if(a<2)
        {
            return a;
        }
        int start =0;
        int end = a;
        int ans =0;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if((long)mid*mid<=a)
            {
                ans=mid;
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
        }
        
    }
