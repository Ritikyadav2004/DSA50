import java.util.Scanner;
public abstract class ReverString
{
 
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter String :");
        String str = s.nextLine();
        s.close();
    for(int i=str.length()-1;i>=0;i--)
    {
        System.out.print(str.charAt(i));
    }
    }
    


}
