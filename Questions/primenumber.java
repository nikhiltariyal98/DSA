    package Questions;

    public class primenumber 
    {
        public static void main(String[] args) {
            int n =71;
            isPrime(n);
        }
        static void isPrime(int a)
        {
            int flag = 0;
            for(int i =2;i*i<=a;i++)
            {
                if(a%i==0)
                {
                    flag++;
                    System.out.println("Not a prime number");
                    return;
                }
            }
            if(flag==0)
            {
                System.out.println("Prime number");
            }
        }
        
    }
