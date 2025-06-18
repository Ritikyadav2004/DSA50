public class valid_pallindrom_aftre_del {

    public static String remove(String str,char l)
    {   
       // CONVERTING INTO CHARARRAY       
        char[] chararray = str.toCharArray();
        // MAKING NEW ARRAY OF REDUCES SIZE BY 1
        char [] newchar = new char[chararray.length-1];
         int i;
         Boolean flag = false;
        for(i=0;i<newchar.length;i++)
        {   
            if(chararray[i]==l) //IF CHARACTER FOUND  ABECBA
            {   flag=true;
                break;
            }
            else{
                newchar[i] = chararray[i];
            }
        }
        if(flag)
        {
        for(int j=i;j<newchar.length;j++)
        {
            newchar[j]=chararray[j+1];
        }
        }

        return String.valueOf(newchar);
    }
    static char temp;
    public static boolean check(String str)
    {
        boolean flag = false;
        for(int i=0;i<str.length()/2;i++)
        {  flag=false;
          if(str.charAt(i)==str.charAt(str.length()-1-i))
          {
            flag=true;
          }
          else
          {         
            temp = str.charAt(i);
          }
        }
        if(flag)return true;
        return false;

    }
    public static void main(String[] args)
    {
        String str = "ABGEBA";
        if(!check(str))
        {
           
            System.out.println(check(remove(str, temp))+"\nString is pallindrome after removing charater:"+temp);
            System.out.println(remove(str, temp));
        }
       else
       {
        
        System.out.println(check(str)+"\nString is already pallindrom");
        System.out.println(str);
       }
      
        
    }
    
}
