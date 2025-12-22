package Questions;

import java.util.Arrays;

public class reverseanarray
 
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int s = 0;
        int e = arr.length-1;
        System.out.println("Original array : " + Arrays.toString(arr));
        while(s<e)
        {
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        System.out.println("Reversed array : " + Arrays.toString(arr));

    }
    
}
