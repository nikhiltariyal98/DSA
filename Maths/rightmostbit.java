package Maths;

public class rightmostbit{
    public static void main(String[] args)
    {
        int a = 255; 
        if(a==0)
        {
            System.out.println("No set bits");
            return;
        }
        else
        {
            int rmb = a&-a;
            int placermb = (int)(Math.log(rmb)/Math.log(2));
            System.out.println(placermb);
            return;
        }

        
    }
}