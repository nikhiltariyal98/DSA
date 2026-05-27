package BitwiseOperators;

public class numberonlyonce {
    public static void main()
    {
        int[] arr = {-1,-2,-3,-4,5,-1,-2,-3,-4};
        // Irrespective of array having positive or negative numbers it's still gonna be the same xor logic
        int res = 0;
        for(int i:arr)
        {
            res^=i;
        }
        System.out.println("Unqiue element is: "+res);
    }
}
