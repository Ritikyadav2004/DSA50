public class subsequnce_string {
    public static boolean isSubsequnce(String str1, String str2) {
     
      
        int count=0;
        for (int k = 0; k < str1.length(); k++) {
            //   flag = false;
            
            for(int i=0;i<str2.length();i++)
            {
                   if(str1.charAt(k)==str2.charAt(i))
                   {
                    count++;
                    break;
                   }
                   else
                   continue;
                   
            }

        }
        if(count==str2.length())return true;
        else return false;


    }
    public static void main(String[] args) {
        String s1 = "abcdefghj";
        String s2 = "gacjz";
        System.out.println(isSubsequnce(s1, s2));

    }

}
