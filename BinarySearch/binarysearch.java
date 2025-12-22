package BinarySearch;


public class binarysearch
 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int s = 0;
        int e = a.length-1;
        int se = 5;
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
