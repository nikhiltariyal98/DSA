package BinarySearch.Questions;

public class leetcode852 
{
    // peakindexinmountainarray 
    public static void main(String[] args) 
    {
        int[] arr = {1, 3, 5, 7, 6, 2};
        int start = 0;
        int end= arr.length-1;

        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                // The potential answer is on the left side or the mid
                end = mid;
            }
            else
            {
                start=mid+1;
            }
        }
        // the loop will break when there is only elment that will be the peak
        System.out.println("Peak is at "+start);

        
    }
    
}
