import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Longest_substring_without_repeating_characters
{    
    public static int longest_substring(String str)
      {
        HashMap<Character,Integer> dict =new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(dict.containsKey(str.charAt(i))!=true)
            {
               dict.put(str.charAt(i),1);

            }
           
    

            
            
            
        }
        int count=0;
        for(Map.Entry<Character,Integer> entry : dict.entrySet()) 
        {   
            if(entry.getValue()==1)
            count++;
        }
        
         return count;


        
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = s.nextLine();
        System.out.println("length of unique Char: "+longest_substring(str));

        s.close();
    }
}
