import java.util.Scanner;

public class kth_maximum {
public static void main(String[] args) {
   int arr[] = {12,2343,45,65,66};
   for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                }
            }
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter kth Element for max and min:");
        int n = s.nextInt();
        s.close();
        System.out.println(n+" Maximum Elemnt is :"+arr[arr.length-n-1]);
        System.out.println(n+" Minimum Elemnt is :"+arr[n]);
   
}
}
