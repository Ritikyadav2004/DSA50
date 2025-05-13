public class union_intersaction {
    public static void main(String[] args) {
        int arr1[] = {12,23,32,34,4,5,5,6};
        int arr2[] = {12,23,43,45,56,4,5,5};
        //union
        int k=0;
        int arr3[] = new int[arr1.length+arr2.length];
        for(int i = 0;i<(arr1.length+arr2.length);i++)
        {   
            
           if(i<arr1.length)
           {
            arr3[i] = arr1[i];
           }
           else{
            arr3[i] = arr2[k];
            k++;
           }

    }
    System.out.println("Union Of Two Array");
    for(int i=0;i<arr3.length;i++)
    {
        System.out.print(arr3[i]+ " ");
    }

    //intersection
    int l=0;
    int arr4 []= new int[10];
    System.out.println("\nIntersaction Of Two Array");
    for(int j=0;j<arr1.length;j++)
    {
        for(int k1=0;k1<arr2.length;k1++)
        {
            if(arr1[j]==arr2[k1])
            {
                arr4[l] = arr1[j];
                l++;
                break;
            }
        }
    }
    for(int i1 = 0;i1<l;i1++)
    {
        for(int j1 = i1+1;j1<l;j1++)
        {
            if(arr4[i1]==arr4[j1])
            {
                arr4[i1]=arr4[j1];
                l--;
            }
        }
    }
     for(int i=0;i<l;i++)
    {
        System.out.print(arr4[i]+ " ");
    }
}
}
