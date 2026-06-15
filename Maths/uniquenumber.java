package Maths;

public class uniquenumber {
    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,1,2,3};
        int ans =0;
        for(int i:a)
        {
            ans^=i;
        }
        System.out.println(ans);

    }
}
