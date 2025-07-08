public class pascal_triangle
{
 public static void main(String[] args) {
    int n=5;
    for (int i = 1; i <=n; i++)  // tell row 
    {   
        for(int k=n-i;k>=1;k--)
        {
            System.out.print("  ");
        }
        for (int j = 1; j <= 2*i-1; j++) {
        System.out.print("*"+" ");
    }
    System.out.println();}
 }
}