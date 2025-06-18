public class strstr{
    public static void main(String[] args)
    {
        String str1 = "Hey There ";
        String str2 = "Hey";
        
        boolean flag = false;
        boolean flag1=true;  
        int temp=0;
        for (int i = 0; i < str2.length(); i++) {
            
            for (int j = 0; j < str1.length(); j++)
            {
             
                if(str1.charAt(i)==str2.charAt(j))
                {
                    if(flag1)
                    {
                         temp =i;
                        flag1=false;
                    }

                    flag=true;
                    continue;
                    
                }
                else
                {
                    flag=false;
                    break;
                }
            }
            
        }
        if(flag)
        {
            System.out.println("Substring start from index :"+temp+" in String 1");
        }
        else
        {
            System.out.println("Substring not found");
        }
        // System.out.println(index);

    }
    
}
