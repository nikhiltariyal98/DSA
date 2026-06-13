package BitwiseOperators;

public class pascaltriangle{
    public static void main(String[] args)
    {
        // Find sum of nth row in pascal triangle
        int n = 5;
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(Math.pow(2,n-1));
    }
}