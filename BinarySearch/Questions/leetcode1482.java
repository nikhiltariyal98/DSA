package BinarySearch.Questions;

import java.util.Arrays;

public class leetcode1482 
{
    public static void main(String[] args)
    {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        System.out.println(minDays(bloomDay, m, k));
        
    }
    static int minDays(int[] bloomDay, int m, int k) 
    {
        if((long)m*k>bloomDay.length)
        {
            return -1;
        }
        int start = Arrays.stream(bloomDay).min().getAsInt();
        int end = Arrays.stream(bloomDay).max().getAsInt();
        int ans = end;
        while (start<=end) 
        {
            int mid = start+(end-start)/2;
            int streak=0;
            int bouquet=0;
            for(int i :bloomDay)
            {
                if(i<=mid)
                {
                    streak++;
                    if(streak==k)
                    {
                        bouquet++;
                        streak=0;
                    }
                }
                else
                {
                    streak=0;
                }
            }
            if(bouquet>=m)
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
