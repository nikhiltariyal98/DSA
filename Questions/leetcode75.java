package Questions;

import java.util.Arrays;

public class leetcode75 
{
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        sortColors(arr);

    }
    static public void sortColors(int[] nums) 
    {
        int zero=0;
        int one=0;
        int two=0;
        for(int i :nums)
        {
            if(i==0)
            {
                zero++;
            }
            else if(i==1)
            {
                one++;
            }
            else
            {
                two++;
            }
        }
        int idx=0;
        for(int i=0;i<zero;i++)
        {
            nums[idx++]=0;
        }
        for(int i=0;i<one;i++)
        {
            nums[idx++]=1;
        }
        for(int i=0;i<two;i++)
        {
            nums[idx++]=2;
        }
        System.out.print(Arrays.toString(nums));

        
    }
    
}
