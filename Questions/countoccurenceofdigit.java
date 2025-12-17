package Questions;

public class countoccurenceofdigit 
{
    // 13345 = 3 occurs 2 times
    public static void main(String[] args) 
    {
        int n = 3333;
        int count=0;
        while(n>0)
        {
            int digit = n%10;
            n=n/10;
            if(digit == 3)
            {
                count++;
            }

        }
        System.out.println("3 coccurs "+count+" times");
        
    }
    
}
