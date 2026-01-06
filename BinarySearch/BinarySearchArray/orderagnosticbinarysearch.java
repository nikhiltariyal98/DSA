package BinarySearch.BinarySearchArray;
public class orderagnosticbinarysearch 
{
    public static void main(String[] args) 
    {
        int arr[] = {3,3,3,4,5};
        int start =0;
        int end = arr.length-1;
        int searched=5;
        // determine order
        boolean isAsc = arr[start]<=arr[end];
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]== searched)
            {
                System.out.println("Found");
                return ;
            }
            else if (arr[mid]<searched)
            {
                if(!isAsc)
                {
                    end=mid-1;
                }
                else
                {
                    start= mid+1;
                }

            }
            else
            {
                if(!isAsc)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }

            }
        }
        System.out.println("Not found");
        
    }
    
}
