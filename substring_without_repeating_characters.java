import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class substring_without_repeating_characters
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String");
        String str = s.nextLine();
        HashMap<Character,Integer> dict =new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(dict.containsKey(str.charAt(i))!=true)
            {
               dict.put(str.charAt(i),1);

            }
            else
            {
                // int val = dict.get(str.charAt(i)); //return value of that key
                
                break;

            }
    

            
            
            
        }
        for(Map.Entry<Character,Integer> entry : dict.entrySet()) 
        {   
            if(entry.getValue()==1)

            System.out.print(entry.getKey());
        }
        s.close();



        
    }
}
