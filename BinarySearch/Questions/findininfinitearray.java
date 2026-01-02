package BinarySearch.Questions;

public class findininfinitearray 
{
    public static void main(String[] args) 
    {
        int[] arr = {2,5,7,9,10,90,100,140,404};
        int target = 10;
        ans(arr,target);
        
    }
    static void ans(int[] arr,int target)
    {
        int start = 0;
        int end = 1;

        while(target>arr[end])
        {
            // double the chunk size
            int temp = end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        binarySearch(arr,target,start,end);

    }
    static void binarySearch(int[] a, int se, int s,int e)
    {
         while(s<=e)
        {
            int mid = (s+e)/2;
            if(a[mid]==se)
            {
                System.out.println("Found at: "+mid);
                return;
            }
            else if (a[mid]<se)
            {
                s= mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        System.out.println("Not found ");
    }
    
}
