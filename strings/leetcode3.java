package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class leetcode3 
{
    public static void main(String[] args) 
    {
        String s = "pwwkew";
        lengthOfLongestSubstring(s);
        
    }
    public static void lengthOfLongestSubstring(String s)
    {
        int left =0;
        int maxLen=0;
        Set<Character> hs = new HashSet<>();
        for(int right =0;right<s.length();right++)
        {
            char ch = s.charAt(right);
            while(hs.contains(ch))
            {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(ch);
            maxLen= Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);

    }
    
    
}
