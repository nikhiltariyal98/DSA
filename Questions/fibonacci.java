package Questions;

import java.util.Scanner;

public class fibonacci 
{
    public static void main(String[] args) 
    {
        int a =0;
        int b =1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1)
        {
            System.out.println("Fib is: "+n);
            return;
        }
        else
        {
            for(int i=2;i<=n;i++)
            {
                int res= a+b;
                a=b;
                b=res;
            }
        }
        System.out.println("fib is : "+b);
    }
    
}
