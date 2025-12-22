package Questions;

public class armstrong 
{
    public static void main(String[] args) 
    {
        int a = 153;
        int b =a;
        // armstrong are 153 = 1 cube + 5 cube + 3 cube = 153
        int sum = 0;
        while(a>0)
        {
            int digit = a%10;
            sum+=digit*digit*digit;
            a=a/10;
        }
        if(sum == b)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not armstrong");
        }
        
    }
    
}
