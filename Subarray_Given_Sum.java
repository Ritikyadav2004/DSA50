

public class Subarray_Given_Sum 
{
  public static void main(String[] args)
  {
    int [] arr  = {12,20,2,20,45,4,456,};
    int target=12;
    int start=0;
    int end = 0;
    int cur_sum=0;
    for(int i=0;i<arr.length;i++)
    {
        cur_sum+=arr[i];
        while (cur_sum>target && start<i )
        {
            cur_sum-=arr[start];
            start++;
            if(cur_sum==target)
            {    
                
                break;
                
            }
            
        }
        end = i;
        if(cur_sum==target)
        {
           for(int i1=start;i1<=end;i1++)
    {
        System.out.println("elements Present at : "+i1+" Have Value :"+arr[i1] );
    }
    System.out.println("Have Sum = "+target);
     return;
        }

    }
    System.out.println("No subarray with given sum found.");
    
  }
    
}
