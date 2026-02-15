package BitwiseOperators;

public class findNonRepeatingTwice
{
    public static void main(String[] args) 
    {
        int[] arr ={1,2,3,1,2,3,5};
        int unique =0;
        for(int a:arr)
        {
            unique^= a;
        }
        System.out.println("Unique number is: "+unique );
        
    }
    
}
