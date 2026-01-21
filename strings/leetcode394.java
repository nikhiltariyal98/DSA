package strings;

public class leetcode394 
{
    public static void main(String[] args) 
    {
        checkPalindrom("abca");
        
    }
    public static void checkPalindrom(String s)
    {
        int left =0;
        int right = s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)==s.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("palindrome");
        
    }
    
}
