package Questions;

public class leectode1295 
{
    public static void main(String[] args) 
    {
        int[] nums = {12,345,2,6,7896};
         int finalcount = 0;
       for(int a :nums)
       {
        int count =0;
        while(a>0)
        {
            a=a/10;
            count++;
        }
        if(count%2==0)
        {
            finalcount++;
        }
       }
    System.out.println(finalcount);
        
        
    }
    // TRICK TO FIND NUMBER OF DIGITS
    // if the number is negative * it by -1 nad then use the trick
    // (int)(Math.log10(n))+1;
}   
