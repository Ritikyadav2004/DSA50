//import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Compress_the_string
{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter String:");
       String str = s.nextLine();
       HashMap <Character,Integer> dict = new HashMap<>();
      //char[] charray = str.toCharArray();
      System.out.println("Original String :\n"+str);
      for (int i = 0; i < str.length(); i++)
      { 
        //This is becouse str.charAt(i) return character and our dict is of string type 
        if(dict.containsKey((str.charAt(i)))!=true)
        {
           dict.put(str.charAt(i), 1);

        }
        else
        {
            int val = dict.get(str.charAt(i));
            dict.put(str.charAt(i), val+1);
        }
      }
      System.out.println("Compress String : ");
      for(Map.Entry<Character,Integer> entry : dict.entrySet())
      {
        System.out.print(entry.getKey()+""+entry.getValue());
      }
      


      s.close();


    }
}