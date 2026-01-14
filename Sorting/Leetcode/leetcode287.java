package Sorting.Leetcode;

import java.util.ArrayList;

public class leetcode287 
{
    public static void main(String[] args) {
        
int[] nums = {1,3,4,2,2};
        int i =0;
        while(i<nums.length)
        {
            int cor = nums[i]-1;
            if(nums[i]!=i+1 && nums[i]!=nums[cor])
            {
                int temp = nums[i];
                nums[i]=nums[cor];
                nums[cor] = temp;
            }
            else
            {
                i++;
            }
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(int j =0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                System.out.println("Duplicate "+ nums[j]);
                break;
            }
        }
             
    }
    
}

