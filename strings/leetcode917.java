package strings;

public class leetcode917
{
    public static void main(String[] args)
    {
        String  s = "Test1ng-Leet=code-Q!";
        char[] cha = s.toCharArray();
        int i =0;
        int j = s.length()-1;
        while(i<j)
        {
            int start =(int) s.charAt(i);
            int end = (int) s.charAt(j);
            if(!(start>=97 && start<=122 || start>=65 && start<=90))
            {
                i++;
            }
            else if (!(end>=97 && end<=122 || end>=65 && end<=90))
            {
                j--;
            }
            else
            {
                // swap;
                char temp =cha[i];
                cha[i]=cha[j];
                cha[j]=temp;
                i++;
                j--;
            }
        }
        String ans = new String(cha);
        System.out.println(ans);
    }
}