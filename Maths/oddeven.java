package Maths;

public class oddeven {
    public static void main(String[] args)
    {
        int a = 15;
        String ans = (a&1)==1?"odd":"even";
        System.out.printf("The entered number %d is : %s%n", a,ans);
    }
}
