
public class missing_Number {
    static int max_elemnt(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    
    }
    public static void main(String[] args) 
    {
        int [] arr = {1,2,4,5,6,7,8,9,10};
        int max = max_elemnt(arr);
        //System.out.println(max);
        int autual_sum = (max*(max+1))/2;
       // System.out.println(autual_sum);
        int calculated_sum = 0;
        for(int i=0;i<arr.length;i++)
        {
          calculated_sum+=arr[i];
        }
        int missing = autual_sum-calculated_sum;
        System.out.println("Missing Elemnt is :"+missing);
    }
    
}
