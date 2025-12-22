package Questions;

public class leetcode1672 
{
    public static void main(String[] args) {
        int wealthy = 0;
        int[][] arr = {{1,5},{7,3},{3,5}};
        for(int[] a :arr)
        {
            int sum = 0;
            for(int b:a)
            {
                sum+=b;
            }
            if(sum>wealthy)
            {
                wealthy=sum;
            }
        }
        System.out.println("The wealthiest is : "+wealthy);
    }
    
}
