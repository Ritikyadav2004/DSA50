public class longest_comman_prefix 
{
    public static String comman_prefix(String str1,String str2)
    {
        StringBuilder t = new StringBuilder();
        int len = Math.min(str1.length(),str2.length());
        for(int i=0;i<len;i++)
        {
            if(str1.charAt(i)==str2.charAt(i))
            {
                t.append(str1.charAt(i));
            }
            else
            {
                break;
            }
        }
        return t.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(comman_prefix("Ritik Yadav", "Rishab Yadav"));
    }
    
}
