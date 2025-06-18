public class string_to_intger{

    public static int converter(String str)
    {   
        int num  = 0; 
        for(int i=0;i<str.length();i++)  
        {
            if( (int)str.charAt(i)>=48 && (int)str.charAt(i)<=57)
            {
                //logic here
                num=num*10;
                num = num+((int)str.charAt(i)-48);
            }
        }
        return num; // Add appropriate return value
    } 
    public static void main(String[] args)
    {
        System.out.println(converter("hi there 123"));
    }
    
}
