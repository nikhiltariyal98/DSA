package BinarySearch.Questions;

import java.util.Arrays;

public class leetcode1011 
{
    public static void main(String[] args) 
    {
       int[] weights = {1,2,3,4,5,6,7,8,9,10};

       int  days = 5;
       System.out.println(shipWithinDays(weights, days)); 
    
    }
    static int shipWithinDays(int[] weights, int days) 
    {
         int start = Arrays.stream(weights).max().getAsInt();
         int end = Arrays.stream(weights).sum();
         while(start<end)
         {
            int mid = start+(end-start)/2;
            int sum = 0;
            int pieces=1;
            for(int num:weights)
            {
                if(sum+num>mid)
                {
                    sum=num;
                    pieces++;
                }
                else
                {
                    sum+=num;
                }
            }
            if(pieces>days)
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
    
}
