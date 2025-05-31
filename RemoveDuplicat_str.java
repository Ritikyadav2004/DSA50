import java.util.Scanner;

public class RemoveDuplicat_str
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your String:");
        String input = s.nextLine();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<input.length();i++)
        {  
            char c = input.charAt(i);
           if(str.indexOf(String.valueOf(c))==-1) // string is a class
           {
            str.append(c);
           }
       
        }    
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
     s.close();
}
}
