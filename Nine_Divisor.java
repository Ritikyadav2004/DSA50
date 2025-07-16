import java.util.HashMap;
import java.util.Map;
public class Nine_Divisor
{
    public static void main()
    {
       HashMap<Integer,Integer> map = new HashMap<>();
       int n=100;
       for (int i = 0; i <= n; i++) {
        boolean flag=false;
        for (int j = 1; j <=i/2; j++)
        {   
            if(flag!=true)
            {
             map.put(i, 1);
             flag=true;
            }
            if(i%j==0)
            {
              int current = map.get(i);//get value of that key
              map.put(i, current+1);
            }
        }
       }
       for(Map.Entry<Integer,Integer> entry : map.entrySet())
       {if(entry.getValue()==9)
        System.out.println(entry.getKey()+":"+entry.getValue());
       }


    }
}