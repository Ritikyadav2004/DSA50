public class checkSorted {
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,6,5};
        boolean flag = false;
        for(int i=0;i<arr.length-1;i++)
        {
         if(arr[i]<arr[i+1])
         {
            continue;
         }
         else
         {  
            flag = true;
            break;
            
         }
        }
        if(flag)System.out.println("Array Not Sorted");
        else System.out.println("Array Sorted ");
    }
    
}
