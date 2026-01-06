package Questions;

import java.util.Arrays;

public class leetcode151 
{
    public static void main(String[] args) 
    {
        String s = "  hello world  ";
        reverseWords(s);
    }
    static void reverseWords(String s) 
    {
       String[] words =  s.split(" ");
       String ans = "";
       for(int i =words.length-1;i>=0;i--)
       {
        if(!words[i].isEmpty())
        {
            ans+=words[i]+" ";
        }
       
       }
        System.out.println(ans.trim());
    }
    
}
