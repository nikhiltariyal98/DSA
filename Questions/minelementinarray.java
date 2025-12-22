package Questions;

public class minelementinarray 
{
    public static void main(String[] args) {
        
    
    int[] arr = {1213,2232,1233,1445,15645};
    int min = Integer.MAX_VALUE;
    for(int i :arr)
    {
        if(i<min)
        {
            min = i;
        }
    }   
    System.out.println("Minimum of all is: "+min);
} 
}
