package BitwiseOperators;


public class oddeven 
{
    public static void main(String[] args) {
        int n =67;
        System.out.println(checkEvenOdd(n));
    }
    public static boolean checkEvenOdd(int a)
    {
        return (a&1) ==1;
    }
    
}
