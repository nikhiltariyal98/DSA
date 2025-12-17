
public class shadowing {
    static int x = 100;
public static void main(String[] args) {
    System.out.println("value of x is : "+x);
    int x = 40;
System.out.println("value of x is : "+x);  // this is shadowing
}    
}
