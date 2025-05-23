import java.util.HashMap;
import java.util.Map;
public class duplicate_elemnts
{
public static void main(String[] args) 
{
    int [] arr = {1,2,3,4,5,3,2};
    HashMap<Integer,Integer> Dict = new HashMap<>();
    for(int i=0;i<arr.length;i++)
    {
        if(Dict.containsKey(arr[i])!=true)
        {
            Dict.put(arr[i], 1);
        }
        else{
            int value = Dict.get(arr[i]);//return the value
            Dict.put(arr[i], value+1);
        }
    } 
    System.out.println("Duplicate Values Are:");
    for(Map.Entry<Integer,Integer> entry : Dict.entrySet())
      {
        if(entry.getValue()>1)
       System.out.println("Number:"+ entry.getKey()+" Occurence:"+entry.getValue());
      }
    
}
}