public class checkDivisiblityofLargeString {
    public static  boolean checkDivisiblty(String s,int divisor)
    {
         int  rem=0;
         int digit=0;
        for(int i=0;i<s.length();i++)
        {
            digit=s.charAt(i)-'0';
            rem=(rem*10+digit)%divisor;
            
        }
        return rem==0;

    }
    public static void main(String args[])
    {
        String s="847367376734746783";
        int number = 17;
        if(checkDivisiblty(s,number))
        {
            System.out.println("Given Number is divisible by :"+number);

        }
        else{
            System.out.println("Not Divisible!!");
        }
        

        
    
    }
    
}
