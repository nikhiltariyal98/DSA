package BinarySearch.Questions;

public class ceilingofanumber 
{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9};
        int target = 20;
        int start = 0;
        int end = arr.length-1;
        if(arr[end]<target)
        {
            System.out.println("Not found");
            return;
        }


        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                System.out.println(arr[mid]);
                return;
            }
            else if (arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        } 
       System.out.println(arr[start]);
    //    if we want floor of a number 
        // print arr[end];
    }
    
    
}
