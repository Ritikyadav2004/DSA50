public class Leaders_In_Array 
{
    public static void main(String[] args)
    {
        int [] arr = {5,4,3,2,1,0};
       
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = false;
            if(i==(arr.length-1))
                {
                    System.out.println("Leader :"+arr[i]);
                    break;
                }
            for(int j=i+1;j<arr.length;j++)
            {
                
                if(arr[i]>arr[j])
                {
                    flag = true;
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag)//if true
            {
                System.out.println("Leader :"+arr[i]);
            }

        }
    }
}
