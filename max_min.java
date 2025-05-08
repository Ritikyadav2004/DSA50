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
        
    }
    
}
