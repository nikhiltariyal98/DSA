package BinarySearch.Questions;

public class leetcode1095 
{
    public static void main(String[] args) {
    

        int[] mountainArr = {1,2,3,4,5,3,1};
        int target =3 ;
        int peak = findPeak(mountainArr);
        int first = ascbinarySearch(target,mountainArr,0,peak);
        if(first!=-1)
        {
            System.out.println(first);
            return;
        }
        int second = descbinarySearch(target,mountainArr,peak+1,mountainArr.length-1);
        System.out.println(second);
    }
    
    static int findPeak(int[] mountainArr)
    {
         int start = 0;
        int end= mountainArr.length-1;

        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(mountainArr[mid]>mountainArr[mid+1])
            {
                end = mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
    static int ascbinarySearch(int t, int[] mountainArr, int s, int e)
    {
       
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(mountainArr[mid]==t)
            {
                return mid;
            }
            else if (mountainArr[mid]<t)
            {
                s= mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return -1;
    }
    static int descbinarySearch(int t, int[] mountainArr, int s, int e)
    {
       
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(mountainArr[mid]==t)
            {
                return mid;
            }
            else if (mountainArr[mid]<t)
            {
                e= mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return -1;
    }
    
}
