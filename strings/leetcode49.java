package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode49 
{
    public static void main(String[] args) 
    {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result= groupAnagrams(strs);
        System.out.println(result.toString());
    }
    public static List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String, List<String>> hs = new HashMap<>();
        for(String s:strs)
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            hs.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(hs.values());

    }
    
}