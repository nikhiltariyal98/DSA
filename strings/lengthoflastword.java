package strings;

public class lengthoflastword 
{
    public static void main(String[] args) 
    {
        String s = "   fly me   to   the moon  ";
        String b = s.trim();
        String[] words = b.split(" ");
        System.out.println(words[words.length-1].length());
        

        
    }
    
}
