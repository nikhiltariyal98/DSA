package Maths;

public class negatives {
     public static void main(String[] args)
    {
        int a[] = {1,2,3,-1,-2};
        int ans =0;
        for(int i :a)
        {
            ans ^= Math.abs(i);
        }
        System.out.println(ans);
        
    }
}
