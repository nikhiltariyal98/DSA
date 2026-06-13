package BitwiseOperators;

public class ifpowerof2 {
    public static void main(String[] args)
    {
        int n =8;
        int counter = 0;
        for(int i =0;i<32;i++)
        {
            int mask = 1<<i;
            if((n&mask)!=0)
            {
                counter++;
            }
        }
    
        System.out.println((counter==1) ? "power of 2" : "not power of 2");
        
        
    }
    
}