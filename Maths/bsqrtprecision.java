package Maths;

public class bsqrtprecision {
    public static void main(String[] args)
    {
        int b = 40;
        System.out.println(solve(b,3));
    }
    public static double solve(int a,int p)
    {
        int s=0;
        int e=a;
        double root = 0.0;
        while(s<=e)
        {
            int m = s+(e-s)/2;
            if(m*m==a)
            {
                return m;
            }
            else if (m*m<a)
            {
                s=m+1;
            }
            else
            {
                e=m-1;
            }
        }
        root=e;
        double inc = 0.1;
        for(int i =0;i<p;i++)
        {
            while(root*root<=a)
            {
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }
        return root;
       
    }
    
}
