package Maths;
import java.util.*;

public class allprimenumbers {
    public static void main(String[] args)
    {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i =0;i<=40;i++)
        {
            if(checkprime(i))
            {
                li.add(i);
            }
        }
        System.out.println(Arrays.asList(li));

    }
    
    public static boolean checkprime(int c)
    {

        if(c<=1)
        {
            return false;
        }
        if(c==2)
        {
            return true;
        }
        if(c%2==0)
        {
            return false;
        }
        for(int i =3;i*i<=c;i+=2)
        {
            if(c%i==0)
            {
                return false;
            }
        }
        return true;

    }
}
