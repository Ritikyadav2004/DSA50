public class count_say_prblm
{

    public static String countsay(int n)
   {
        if(n==1)
        return "1";
        String s = countsay(n-1);
        int c=1,i=1;
        char num = s.charAt(0);
        StringBuilder t = new StringBuilder();
        while(i<s.length())
        {
            if(s.charAt(i)==num)
            c++;
            else
            {
               t.append(c).append(num);
               num = s.charAt(i);
               c=1;//intialise count =1;

            }
            i++;
        }
        t.append(c).append(num);  //appending the last value
   return t.toString();
    }
    public static void main(String[] args)
    {
    System.out.println(countsay(5));
}
}
