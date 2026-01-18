package strings;

import java.util.HashMap;

public class anagram 
{
    public static void main(String[] args) 
    {
       String  s = "anagram";
       String t = "nagaram";
        if(s.length()!=t.length())
        {
            System.out.println("Not anagram");
            return;
        }
    //    now we have freq of each character there in s
       HashMap<Character,Integer> hs = new HashMap<>();
       for(int i =0;i<s.length();i++)
       {
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0)+1);
       }
    //    now lets check the freq of every character of hs in string t and decrement for
    // every character found
    for(int j=0;j<t.length();j++)
    {
        if(hs.containsKey(t.charAt(j)))
        {
            int count =hs.get(t.charAt(j));
            count--;
            if(count==0)
            {
                hs.remove(t.charAt(j));
            }
            else
            {
                hs.put(t.charAt(j),count);
            }   
        }
    }
    if(hs.isEmpty())
    {
        System.out.println("Anagrams");
    }
    else
    {
        System.out.println("Not anagrams");
    }
      

       

        
    }
    
}
