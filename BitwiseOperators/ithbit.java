package BitwiseOperators;

public class ithbit {
    public static void main(String[] args)
    {
        int i =5;
        int j =2;
        int mask = 1<<j;
        int fin = i & mask;
        int res = (fin==0)?0:1;
        System.out.println(res); 
    }
}
