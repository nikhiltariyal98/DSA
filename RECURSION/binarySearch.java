package RECURSION;

public class binarySearch 
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,55,66,78};
        int target =66;
        int res = binary(arr,target,0,arr.length-1);
        System.out.println(res);
        
    }
    public static int binary(int[] arr, int target, int start,int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[mid]<target)
        {
            return binary(arr, target, mid+1, end);
        }
        
        return binary(arr, target, start, mid-1);

    }
    
}
