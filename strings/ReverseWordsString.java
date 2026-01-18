package strings;

public class ReverseWordsString 
{
    public static void main(String[] args) {
        String s = "  a good   example  ";
        String[] words = s.split(" ");
        String res="" ;
        for(int i =words.length-1;i>=0;i--)
        {
            if(!words[i].isEmpty())
            {
                res+=words[i]+" ";
            }
        }
        System.out.println(res.trim());
    }
    
}
