package Sorting.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode448 
{
    public static void main(String[] args) 
    {
        int[] nums = {4,3,2,7,8,2,3,1};
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
                li.add(j+1);
            }
        }
        System.out.println(li);      
    }
    
}
