package Maths;

public class findithbit {
    public static void main(String[] args)
    {
        int a = 5;
        int i=2;
        if((a&(1<<i))!=0)
        {
            System.out.println("the "+i+"th bit is: 1");
        }
        else
        {
            System.out.println("the "+i+"th bit is: 0");
        }
    }
    
}
