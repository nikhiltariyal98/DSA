package BitwiseOperators;
public class resetbit {
    public static void main(String[] args)
    {        int i =5;
        int j =0;
        int mask = ~(1<<j);
        int fin = i & mask;
        System.out.println(fin); 
    }
}