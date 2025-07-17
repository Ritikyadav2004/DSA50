import java.util.*;

public class nextPrime {
   public static boolean isprime(int n)
   {
       if(n<=1)
       return false;
       if(n<=3)
       return true;
       
       for(int i=2;i<=Math.sqrt(n);i++)
       {
           if(n%i==0)
           return false;
       }
       return true;
   }
  public static void main(String args[])
  {   
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m=n+1;
      while(!isprime(m))
      {
          m++;
      }
      System.out.println("Next Prime Number After:"+n+"\n"+m);
      sc.close();
  }
}