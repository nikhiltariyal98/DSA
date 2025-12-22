package BinarySearch;
public class orderagnosticbinarysearch 
{
    public static void main(String[] args) 
    {
        int arr[] = {3,3,3,4,5};
        int asc = 0;
        int desc = 0;
        int allsame = 0;
        int start =0;
        int end = arr.length-1;
        int searched=5;
        // determine order
        if(arr[0]<arr[arr.length-1])
        {
            asc++;
        }
        else if (arr[0]>arr[arr.length-1])
        {
            desc++;
        }
        else
        {
            if(arr[0]==searched)
            {
                return;
            }
            else
            {
                System.out.println("Not found");
                return;
            }
        }
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]== searched)
            {
                System.out.println("Found");
                return ;
            }
            else if (arr[mid]<searched)
            {
                if(desc==1)
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
                if(desc==1)
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
