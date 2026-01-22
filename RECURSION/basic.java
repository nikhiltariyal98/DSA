package RECURSION;

public class basic 
{
    public static void main(String[] args) 
    {
        nikhil(1);
        
    }
    static void nikhil(int i)
    {
        if(i==6)
        {
            return;
        }
        System.out.println(i);
        nikhil(i+1);
    }
    
}
