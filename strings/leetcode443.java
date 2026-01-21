package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class leetcode443 
{
    public static void main(String[] args) 
    {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int read = 0;
        int write = 0;
        int total = chars.length;
        while(read<total)
        {
            char current = chars[read];
            int count =0;
            while(read<total && chars[read]==current)
            {
                read++;
                count++;
            }
            chars[write++]=current;
            if(count>1)
            {
                for(char c :String.valueOf(count).toCharArray())
                {
                    chars[write++]=c;
                }
            }
        }
        int newLength = write;
        // Print compressed array
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println("\nNew length: " + newLength);


    }

    
}
