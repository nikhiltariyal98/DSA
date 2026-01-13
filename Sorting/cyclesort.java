package Sorting;

import java.util.Arrays;

public class cyclesort 
{
    public static void main(String[] args)
    {
        int[] nums = {3,5,2,1,4};
        cyclesort(nums);
        
    }
    static void cyclesort(int[] nums)
    {
        int i =0;
        while(i<nums.length)
        {
            if(nums[i]!=i+1)
            {
                int correct = nums[i]-1;
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct] = temp;
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    
}
