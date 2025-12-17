package Questions;

import java.util.Scanner;

public class upperlowercasecheck 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a character ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c >='a' && c<='z')
        {
            System.out.println("lower case");
        }
        else if (c>='A' && c<='Z')
        {
            System.out.println("Upper case");
        }
        else
        {
            System.out.println("invalid");
        }
        
    }
    
    
}
