package Questions;

import java.util.Scanner;

public class LargestNumber 
{
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<3;i++)
        {
            System.out.println("Enter a integer: ");
            int a= sc.nextInt();
            if (a>max)
            {
                max=a;
            }
        }
        System.out.println("Maximum is : ");
        
    }
    
}
