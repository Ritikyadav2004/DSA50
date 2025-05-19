import java.util.HashMap;
import java.util.Map;
public class countOccrenceOfElement
{
    public static void main(String[] args)
    {
      HashMap<Integer,Integer> Score = new HashMap<>();
      int arr[] = {1,1,2,2,3,3,4,4,5,5,6,6,77,7};
      for(int i = 0;i<arr.length;i++)
      {
        if(Score.containsKey(arr[i])!=true)
        {
            Score.put(arr[i], 1);
        }
        else
        {
            // Score.containsKey(arr[i])==true
            int value = Score.get(arr[i]);//finding the value of key 
            Score.put(arr[i],value+1);
        }

      }
      for(Map.Entry<Integer,Integer> entry : Score.entrySet())
      {
       System.out.println("Number:"+ entry.getKey()+" Occurence:"+entry.getValue());
      }
    }
}