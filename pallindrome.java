import java.util.Scanner;
public class pallindrome 
{
    public static void main(String[] args) 
    {
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter Your Srting:");
        String str = s.nextLine();
        int len  = str.length()-1;
        boolean flag = true;
        for(int i=0;i<str.length()/2;i++)
        {   
            flag = false;
          if(str.charAt(i)==str.charAt(len-i))
          {
            flag=true;
          }
          else
          {
            break;
          }
        }
        if(flag)
        {
            System.out.println("String is pallindrome");
        }
        else{
            System.out.print("String is not pallindrome");
        }
        s.close();

    }
}
