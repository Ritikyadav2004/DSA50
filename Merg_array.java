public class Merg_array
{
    public static void main(String[] args)
    {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        System.out.println("Original Array 1:");
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        System.out.println();
         System.out.println("Original Array 2:");
        for (int i : arr2) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        int arr3[] = new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr3.length;i++)
        {
            if(i<arr1.length)
            {
                arr3[i]=arr1[i];

            }
            else
            {
                arr3[i]=arr2[k];
                k++;
            }
        }
        System.out.println("After Merging Array:");
        System.out.print("[ ");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        System.out.print("]");

        
    }
    
}
