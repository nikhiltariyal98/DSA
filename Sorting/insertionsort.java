package Sorting;

import java.util.Arrays;

public class insertionsort 
{
    public static void main(String[] args) 
    {
        int[] nums = {3,4,5,1,2};
        insertionsort(nums);
    }
    static void insertionsort(int[] nums)
    {
        for(int i =0;i<nums.length-1;i++)
        {
            for(int j =i+1;j>0;j--)
            {
                if(nums[j]<nums[j-1])
                {
                    int temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
    
}
