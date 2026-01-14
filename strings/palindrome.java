package strings;

public class palindrome 
{
    public static void main(String[] args) 
    {
        String  s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        
    }
    static public boolean isPalindrome(String s) 
    {
        String b = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int j = b.length()-1;
        for(int i =0;i<b.length()/2;i++)
        {
            if(!(b.charAt(i)==b.charAt(j--)))
            {
                return false;
            }
        }
        return true;
        
    }
    
}
