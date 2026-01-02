package BinarySearch.Questions;
import java.util.Arrays;
public class leetcode410 
{
    static int splitArray(int[] nums, int k) 
    {
        int start = Arrays.stream(nums).max().getAsInt();
        int end = Arrays.stream(nums).sum();
        while(start<end)
        {
            int mid = start+(end-start)/2;
            int sum = 0;
            int pieces =1;
            for(int num:nums)
            {
                if(sum+num>mid)
                {
                    //Can't add in the same subarray but create a new one
                    sum=num;
                    pieces++;
                }
                else
                {
                    sum+=num;
                }
            }
            if(pieces>k)
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return end;

    }
    public static void main(String[] args) 
    {
        int k =2;
        int[] nums = {7,4,5,8,10,};
        System.out.println(splitArray(nums,k));
        
    }
    
}
