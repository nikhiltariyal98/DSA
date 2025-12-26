package BinarySearch.Questions;

public class leectcode744 
{
    public static void main(String[] args) 
    {
        char[] letters = {'c','e','f'};
        char target = 'c';
        // 744. Find Smallest Letter Greater Than Target
         int start = 0;
        int end = letters.length-1;
        if(letters[end]<=target)
        {
            System.out.println(letters[0]);
            return;
        }
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if (letters[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        } 
       System.out.println(letters[start]);
        
    }
    }
    

