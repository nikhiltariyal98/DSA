package Maths;

public class primenumber {
    public static void main(String[] args)
    {
        int i =36;
        System.out.println(isPrime(i));

    }
    public static boolean isPrime(int a)
    {
        if(a<=1)
        {
            return false;
        }
        int c = 2;
        while(c*c<=a)
        {
            if(a%c==0)
            {
                return false;
            }
            c++;
        }
        return true;

    }
    
}
