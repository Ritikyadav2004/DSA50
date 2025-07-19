import java.util.HashMap;
import java.util.Map;

public class uniquePossibleVowel {
    public static int Calculate(String str) {
        HashMap<Character,Integer> dict = new HashMap<>();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a')
            {
                dict.put('a', 1);
            }
            else if(str.charAt(i)=='i')
            {
                dict.put('i',1);
            }
            else if(str.charAt(i)=='e')
            {
                dict.put('e', 1);
                
            }
            else if(str.charAt(i)=='u')
            {
                dict.put('u', 1);
            }
            else if(str.charAt(i)=='o')
            {
                dict.put('o', 1);
            }
            else
            {
                continue;
            }
        }
        for (Map.Entry<Character, Integer> entry : dict.entrySet()) {
    //System.out.println(entry.getKey() + " : " + entry.getValue());
         count+=entry.getValue();
} 
int result=1;
    for(int i=1;i<=count;i++)
    {
      result*=i;
    }
   return result;


        
    }
    public static void main(String[] args) {
        String str="aeiou";
    System.out.println(Calculate(str));
    }
}
