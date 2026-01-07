package Sorting;

import java.util.Arrays;

public class selectionsort 
{
    public static void main(String[] args) 
    {
         int[] arr =  {5,4,3,2,1};
        for(int i =0;i<arr.length;i++)
        {
            // will place the biggest element at the end and then accordingly for the rest
           int last = arr.length-1-i;
           int maxIndex = getMaxIndex(arr,0,last);
           swap(arr,maxIndex,last);

        }
        System.out.println(Arrays.toString(arr));
        
    }

    private static void swap(int[] arr,int maxIndex, int last) 
    {
        int temp = arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;
       
    }

    private static int getMaxIndex(int[] arr, int start, int last) 
    {
        int max = start;
        for(int i =start;i<=last;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
       
    }
    
}
