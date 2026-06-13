package BitwiseOperators;

public class findnumberofdigits {
    public static void main(String[] args)
    {
        // Previously asked in amazon
        // My first version -  time complexity - O(logb a)
        // int a = 40;
        // int b=2;
        // int i=0;
        // while(Math.pow(b,i)<=a)
        // {
        //     i++;
        // }
        // System.out.println(i);

        // Better version - in terms of precision and memory
        int a = 40;
        int b =2;
        
        // Edge case
        if(a==0)
        {
            System.out.println("1");
            return;
        }
        int count =0;
        int temp =a;

        while(temp>0)
        {
            temp =temp/b;
            count++;
        }
        System.out.println(count);
    }
    
}
