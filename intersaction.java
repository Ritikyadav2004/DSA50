public class intersaction {
    public static void main(String[] args)
    {
        int arr1[] = {1,2,3,4,5};
        int arr2[] ={2,3,4,5,};
        int size = Math.min(arr1.length,arr2.length);
        int arr3[] = new int[size];
        int k=0;
        for(int i=0;i<arr1.length;i++)
        {  
            boolean flag = false;
           for(int j=0;j<arr2.length;j++)
           {
            if(arr1[i]==arr2[j])
            {
                flag = true;
                break;
            }
           }
           if(flag)
           {
            arr3[k] = arr1[i];
            k++;
           }
        }
        // for (int i : arr3) {
        //     System.out.print(i+" ");
        // }
        System.out.println("Comman Element Are:");
        for(int i=0;i<k;i++)
        {
            System.out.print(arr3[i]+" ");
        }
    }
    
}
