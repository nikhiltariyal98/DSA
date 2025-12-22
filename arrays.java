import java.util.Arrays;
import java.util.Scanner;

public class arrays
 
{
    public static void main(String[] args) 
    {
        // 1-D ARRAYS
        // int[] a = new int[3];
        // int[] a = {1,2,3,4};
        // int[] a = new int[3];
        // Scanner sc = new Scanner(System.in);
        // for(int i=0;i<a.length;i++)
        // {
        //     a[i]=sc.nextInt();
        // }
        // for(int i:a)
        // {
        //     System.out.print(i+ " ");
        // }
        // 2-D ARRAYS
        // int[][] arr = {{1,2,3},{2,3,4}};
        // int[][] arr = new int[3][]; 
        // // row mandatory , col not
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j =0;j<arr[i].length;j++)
        //     {

        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // for(int[] a : arr)
        // {
        //     System.out.println(Arrays.toString(a));
        // }
        int[][] arr = {{1,2,3},{1,2}};
        // for(int i =0;i<arr.length;i++)
        // {
        //     for(int j =0;j<arr[i].length;j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println("");
        // }
        // for(int i =0;i<arr.length;i++)
        // {
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        for(int[] a :arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
    
}
