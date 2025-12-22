

public class Linearsearch 
{
    public static void main(String[] args) 
    {
        int[] arr = {};
        linearsearch(arr,5);
    }
    static void linearsearch(int[] arr,int s)
    {
        if(arr.length==0)
        {
            System.out.println("No elements in the array");
            return ;
        }
        else
        {
            for(int i =0;i<arr.length;i++)
            {
                if(arr[i]==s)
                {
                    System.out.println("Element found at "+i+" index");
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }

    
}
