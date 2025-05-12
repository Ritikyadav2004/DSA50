public class sort_negative_positive_no 
{
   public static void main(String[] args)
   {
    int [] arr  = {-1,-2,1,2,1,1,1,1,-1,-1,-1,-1,-1,-1,-2,3,4,5,4,4};
   int k1=1;
   int k2=0;
   int len = arr.length;
   int [] aux = new int[arr.length];
   for(int i=0;i<arr.length;i++)
   {
    if(arr[i]<0)
    {
        aux[k2]=arr[i];
        k2++;
    }
    else
    {
        aux[len - k1] = arr[i];
        k1++;
    }
   }
   for(int i1=0;i1<arr.length;i1++)
   {
    System.out.print(aux[i1]+ " ");
   }
   }
    
}
