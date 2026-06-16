package BitwiseOperators.Leetcode;

import java.util.Arrays;

public class flipimages {
    public static void main(String[] args)
    {
        int a[][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        for(int r=0;r<a.length;r++)
        {
            int last = a[r].length-1;
            for(int c=0;c<a[r].length/2;c++)
            {
                int temp = a[r][c];
                a[r][c]=a[r][last];
                a[r][last]=temp;
                last--;
            }
        }
        for(int r=0;r<a.length;r++)
        {
            for(int c=0;c<a[r].length;c++)
            {
                a[r][c]=(a[r][c]==0)?1:0;
            }
        }

        System.out.println(Arrays.deepToString(a));
    }
}
