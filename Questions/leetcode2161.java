package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode2161 
{
    public static void main(String[] args) 
    {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums,pivot)));
        
    }
    static int[] pivotArray(int[] nums, int pivot) 
    {
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        for(int i:nums)
        {
            if(i<pivot)
            {
                small.add(i);
            }
            else if(i==pivot)
            {
                equal.add(i);
            }
            else
            {
                big.add(i);
            }
            
        }
        small.addAll(equal);
        small.addAll(big);
        for (int i = 0; i < small.size(); i++) {
    nums[i] = small.get(i);
}
        
        return nums;
    }
    
}
