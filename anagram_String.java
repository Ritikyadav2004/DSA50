public class anagram_String 
{
    public static void main(String[] args)
    {
        String str1 = "TAC";
        StringBuilder str2 = new StringBuilder();
        str2.append("CAT");
        boolean flag = false;
        for(int i=0;i<str1.length();i++)
        {
            flag = false;
            for(int j=0;j<str2.length();j++)
            {   
                
                if(str1.charAt(i)==str2.charAt(j))
                {   
                    str2.setCharAt(j, ' ');
                    flag = true;
                    break;
                }
                else
                {
                    continue;
                }
               

            }
        }
        if(flag)System.out.println("Strings are anagram");
        else System.out.println("Strings are not anagrams");
    }
}
