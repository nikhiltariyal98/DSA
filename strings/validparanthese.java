package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validparanthese 
{
    public static void main(String[] args) 
    {
        String  s = "()[]{}";
        if(s.length()%2!=0)
        {
            System.out.println("false");
            return;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)== '(' ||s.charAt(i)== '['|| s.charAt(i)== '{' )
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.isEmpty())
                {
                    System.out.println("false");
                    return;
                }
                else
                {
                    char top = st.pop();
                    if(map.get(top)!=s.charAt(i))
                    {
                        System.out.println("false");
                        return;
                    }
                }


            }
        }
        if(st.isEmpty())
        {
            System.out.println("Valid apranthesis");
        }
        else
        {System.out.println("Not valid");}
    
    
} 
    
}
