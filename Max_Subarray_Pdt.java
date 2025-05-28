public class Max_Subarray_Pdt
{
    public static void main(String[] args) 
    {
        int arr[] = {12,0,2,3,0,1,3,4,0,7,2};
        int current_pdt=1;
        int max_pdt=1;
        for(int i=0;i<arr.length;i++)
        {
            current_pdt*=arr[i];
            if(current_pdt<=0)
            {
                current_pdt=1;
            }
            if(current_pdt>max_pdt)
            {
                max_pdt=current_pdt;
            }
        }
        System.out.println("Maximum Product Of Subarray:"+max_pdt);

    }
}