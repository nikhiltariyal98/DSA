package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode153sum
{
    public static void main(String[] args) 
    {
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        List<List<Integer>> li = new ArrayList<>();
        
        // Optimization
        for(int i =0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int left =i+1;
            int right = nums.length-1;
            while(left<right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0)
                {
                    li.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1])
                    {
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1])
                    {
                        right--;
                    }

                    left++;
                    right--;
                }
                else if(sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        System.out.println(li);
    }
}


        // Brute aproach
        // List<List<Integer>> li = new ArrayList<>();
        // for(int i =0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         for(int p=j+1;p<nums.length;p++)
        //         {
        //             List<Integer> temp = new ArrayList<>();
        //             if(nums[i]+nums[j]+nums[p]==0)
        //             {
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(nums[p]);
        //                 Collections.sort(temp);
        //                 if(!li.contains(temp))
        //                 {
        //                     li.add(temp);
        //                 }
        //             }
                    
        //         }
        //     }
        // }
        // System.out.println(li);

