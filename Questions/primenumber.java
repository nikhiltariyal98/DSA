    package Questions;

    public class primenumber 
    {
        public static void main(String[] args) {
            int n =71;
            isPrime(n);
        }
        static void isPrime(int a)
        {
            if(a<=1)
            {
                System.out.println("Not prime");
                return;
            }
            int flag = 0;
            for(int i =2;i*i<=a;i++)
            {
                if(a%i==0)
                {
                    
                    System.out.println("Not a prime number");
                    return;
                }
            }
           System.out.println("Prime number");
            
        }
        
    }
