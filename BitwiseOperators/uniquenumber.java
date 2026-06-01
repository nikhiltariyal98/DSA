package BitwiseOperators;
public class uniquenumber {
    public static void main(String[] args)
    {
        int[] arr = {3,3,3,3,3,7};
        int res = 0;
        for(int i :arr)
        {
            res+= i;
        }
        System.out.println(res%5);
    }
}