public class Kadane_s 
{
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-2,3,-1,4};
        int max_so_far=arr[0];
        int current_max = 0;
        for(int i=0;i<arr.length;i++)
        {
            current_max=current_max+arr[i];
            if(current_max<0)
            {
                current_max=0;
            }
            if(current_max>max_so_far)
            {
                max_so_far=current_max;
            }
        }
        System.out.println("Sum of Maximum Subarray is "+max_so_far);
    }
}
