import java.util.Scanner;

public class is_str_rotated {
    public static boolean isRotated(String str1, String str2)
    {
        int index=str2.indexOf(str1.charAt(0));
        int rotated_word_len=str1.length()-index;
        if(str1.length()!=str2.length())
        {return false;}
        
        boolean flag = false;
        for (int i = 0; i <rotated_word_len; i++) {
            flag=false;
            if(str1.charAt(i)==str2.charAt(index))
            {
                flag=true;
            }  
            index++;          
        }
        if(flag)return true;
        return false;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
    
            System.out.println("Enter Two String Respectively:");
        String str1= s.nextLine();
        
       
        String str2 = s.nextLine();
        System.out.println(isRotated(str1, str2));
        
        
        
        s.close();
        
        
    }
}
 
