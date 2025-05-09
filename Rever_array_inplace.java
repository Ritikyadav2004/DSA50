import java.util.Scanner;
public class Rever_array_inplace 
{
    public static void main(String[] args) {
        System.out.print("Enter Number Of Elemnt:");
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        int [] arr = new int[no];
        for(int i=0;i<no;i++)
        {
            arr[i] = s.nextInt();
        }
        s.close();
        //Rversing elemnt of array
        for(int i=0;i<no/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[no-1-i];
            arr[no-1-i] = temp;
           
        }
        for(int i=0;i<no;i++)
        {
            System.out.print(arr[i]+" ");
        }
   
}
}
