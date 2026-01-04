package BinarySearch.Questions;

import java.util.Arrays;

public class leetcode875 
{
    public static void main(String[] args)
    {
        int[] arr = {3,6,7,11};
        System.out.println(minEatingSpeed(arr, 8));

        
    }
    static public int minEatingSpeed(int[] piles, int h) 
    {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();
        int ans = end;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            long hours =0;
            for(int p :piles)
            {
                if(p%mid==0)
                {
                    hours+=p/mid;
                }
                else 
                {
                    hours+=p/mid+1;
                }
            }
            if(hours<=h)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        return ans;   
    }
}
