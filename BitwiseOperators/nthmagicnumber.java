package BitwiseOperators;

public class nthmagicnumber 
{
    public static void main(String[] args)
    {
        int n = 50;
        int result =0;
        for(int i =0;i<32;i++)
        {
            int mask = 1<<i;
            if((n&mask)!=0)
            {
                result+= (int)Math.pow(5,i+1);
            }

        }
        System.out.println(result);
        
        
    }
    
}
