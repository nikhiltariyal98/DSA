package BinarySearch.BinarySearch2d;

import java.util.Arrays;

public class binarySearch2dsortedlike1d
{
    public static void main(String[] args) 
    {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(binarySearch2d(arr, 6)));
    }

    // search in the row provided between the columns
    static int[] binarySeach1d(int[][] nums,int row,int colstart,int colend, int target)
    {
        while(colstart<=colend)
        {
            int mid = colstart+(colend-colstart)/2;
            if(nums[row][mid]==target)
            {
                return new int[]{row,mid};
            }
            else if (nums[row][mid]<target)
            {
                colstart=mid+1;
            }
            else
            {
                colend=mid-1;
            }
        }
        return new int[]{-1,-1};

    }
    static int[] binarySearch2d(int[][] nums,int target)
    {
        int rows = nums.length;
        int columns = nums[0].length;
        if(columns==0)
        {
            return new int[]{-1,-1};
        }
        if(rows ==1)
        {
            return binarySeach1d(nums, 0, 0,columns-1,target);
        }
        // run the loop till 2 rows are remaining

        int rowstart=0;
        int rowend = rows-1;
        int columnmid = columns/2;
        while(rowstart<(rowend-1))
        {
            int mid = rowstart+(rowend-rowstart)/2;
            if(nums[mid][columnmid]==target)
            {
                return new int[]{mid,columnmid};
            }
            if (nums[mid][columnmid]<target)
            {
                rowstart=mid;
            }
            else
            {
                rowend=mid;
            }
        }
        // checking whether the target is in the mid column for both the remaining rows
        if(nums[rowstart][columnmid]==target)
        {
            return new int[]{rowstart,columnmid};
        }
        if(nums[rowstart+1][columnmid]==target)
        {
            return new int[]{rowstart+1,columnmid};
        }


        // Search 4 halfs 
        if(target<=nums[rowstart][columnmid-1])
        {
            return binarySeach1d(nums, rowstart, 0, columnmid-1, target);
        }
        if(target>=nums[rowstart][columnmid+1] && target<=nums[rowstart][columns-1])
        {
            return binarySeach1d(nums, rowstart,columnmid+1, columns-1, target);
        }
        if(target<=nums[rowstart+1][columnmid-1])
        {
            return binarySeach1d(nums, rowstart+1, 0, columnmid-1, target);
        }
        else
        {
            return binarySeach1d(nums, rowstart+1,columnmid+1, columns-1, target);
        }



    }
    
}
