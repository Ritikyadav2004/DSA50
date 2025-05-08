import java.util.Scanner;
public class max_min{
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        System.out.println("ENter Number of Elemnt in Array:");
        int no = s.nextInt();
        int arr[] = new int[no];
        for(int i=0;i<no;i++)
        {
            arr[i] = s.nextInt();
        }
        s.close();
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
               min = arr[i];
            }
            if(max<arr[i])
            {
                max  = arr[i];
            }
        }
        System.out.println("Maximum Elemnt is :"+max+"\nMinimum Element is :"+min);
        
    }
    
}
