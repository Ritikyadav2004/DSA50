public class sum_Pair {
    public static void main(String[] args) {
        int arr[] = {12,23,32,23,44,54,56};
        int sum = 55;
        int k=0;
        boolean flag = true  ;
        for(int i=0;i<arr.length;i++)
        {   
            flag = false;
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])==sum)
                {
                    flag = true;
                    k=j;
                    break;
                }
                else{
                    continue;
                }
            }
            if(flag)
             System.out.println("Pair:"+arr[i]+"+"+arr[k]+"="+sum);
        }
    }
    
}
