package Questions;
public class searchin2darray 
{
    public static void main(String[] args) {
        int[][] arr= {{23,21312,21},{1,23,2},{321,21,3123,213}};
        int s = 3123;
        for(int i =0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                if(arr[i][j]==s)
                {
                    System.out.println("found at index "+ i+ ","+j);
                    return;
                }
            }
           

        }
         System.out.println("Element not found");
    }
    
}

// for(int[] a:arr)
// {
//     for(int b :a)
//     {

//     }
// }
