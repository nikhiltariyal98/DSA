package Sorting.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class leetcode1122 
{
    public static void main(String[] args)  
    {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        // arr2 elements will be the priority
        int[] arr2 = {2,1,4,3,9,6};
        HashMap<Integer,Integer> hs = new HashMap<>();
        // Count freq of each number in arr1 
        for(int a:arr1)
        {
            hs.put(a, hs.getOrDefault(a, 0)+1);
        }

        // Build result array in arr2 order
        int[] res = new int[arr1.length];
        int index=0;
        for(int b:arr2)
        {
            int count = hs.getOrDefault(b, 0);
            for(int i =0;i<count;i++)
            {
                res[index++]=b;
            }
            hs.remove(b);
        }
        // leftovers will  be there in the hs
        List<Integer> leftovers = new ArrayList<>(hs.keySet());
        Collections.sort(leftovers);
        for(int b:leftovers)
        {
            int count = hs.getOrDefault(b, 0);
            for(int i =0;i<count;i++)
            {
                res[index++]=b;
            }
        }
         System.out.println(Arrays.toString(res));

    }
    
}
