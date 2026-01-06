package BinarySearch.BinarySearch2d;

import java.util.Arrays;

public class binarySearch2dsortedrowcolumnwise 
{
    public static void main(String[] args)
    {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target = 49;
        int[] a = binarysearch(arr,target);
        System.out.println(Arrays.toString(a));
        
    }
    static int[] binarysearch(int[][] arr,int t)
    {
        int row = 0;
        int col = arr.length-1;
        while(row <arr.length && col>=0)
        {
            if(arr[row][col]==t)
            {
                return new int[]{row,col};
            }
            else if (arr[row][col]>t)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return new int[]{-1,-1};
       
        
    }

    
}
