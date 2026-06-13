package BitwiseOperators;

public class uniqueelement {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,1,2,3,1,2,3,4};
        int repeating = 3;
        int result=0;
        for(int i =0;i<32;i++)
        {
            int bitcount=0;
            for(int num:arr)
            {
                if(((num>>i)&1)==1)
                {
                    bitcount++;
                }
            }
            if(bitcount%3!=0)
            {
                result |=(1<<i);
            }
        }
        System.out.println(result);
    }
    
}
