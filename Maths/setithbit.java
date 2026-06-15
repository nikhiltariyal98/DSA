package Maths;

public class setithbit {
     public static void main(String[] args)
    {
        int a = 13;
        int i=2;
        int mask1= 1<<i;
        int mask2= ~mask1;
        if((1&(a>>i))==1)
        {
            a&=mask2;
        }
        else
        {
            a|=mask1;
        }
        System.out.println(a);
    }
    
}
