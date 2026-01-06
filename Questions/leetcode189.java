package Questions;

import java.util.Arrays;

public class leetcode189 
{
    public static void main(String[] args) 
    {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);

    }
    static public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        System.out.print(Arrays.toString(nums));

    }
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
        
    
}

    
