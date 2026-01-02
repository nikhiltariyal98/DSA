package BinarySearch.Questions;

public class leetcode540
 
{
    // Single element in a sorted array 
    public static void main(String[] args) 
    {
        int[] nums = {1,1,2,2,3,3,4,4,5};
        System.out.println(singleNonDuplicate(nums));
        
    }
    static int singleNonDuplicate(int[] nums) 
    {
        int start = 0;
        int end = nums.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            // making mid point to even so that pair would  be at even indexes
            if(mid%2==1)
            {
                mid--;
            }
            if(nums[mid]==nums[mid+1])
            {
                // if pair exists, and the mid is already at even no way the single element
                // can exist on left side so hence doing mid +2;
                start=mid+2;
            }
            else
            {
                end=mid;
            }
        }
        return nums[start];
        
    }
    
}

