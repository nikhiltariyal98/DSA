package BinarySearch.Questions;

import java.util.Arrays;

public class leetcode34 
{
    public static void main(String[] args) 
    {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans  = {-1,-1};
        ans[0]= binarySearch(nums,target,0);
        ans[1]=binarySearch(nums,target,1);
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
    }
        static int binarySearch(int[] nums,int target,int counter)
    {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end)
            {
                int mid = start +(end-start)/2;
                if(nums[mid]==target)
                {
                    if(counter == 1)
                    {
                        start=mid+1;
                        
                    }
                    else
                    {
                        end=mid-1;
                    }
                    ans= mid;
                }
                else if (nums[mid]<target)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }

            }
            return ans;
        }
    }

    

