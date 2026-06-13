package BitwiseOperators;
public class setbit {
    public static void main(String[] args)
    {
        int i =5;
        int j =1;
        int mask = 1<<j;
        int fin = i | mask;
        System.out.println(fin); 
    }
}