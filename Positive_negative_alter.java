 public class Positive_negative_alter {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,-1,-1,-1,-1,2,-1,-2,-2,1,1}; // Input array
        int countN = 0;

        // Bubble sort to sort the array in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
       
for(int m1=0;m1<arr.length;m1++)
{
    if(arr[m1]<0)
    {
        countN++;
    }
}
       
        // Store the count of negative numbers in negStart
        int negStart = countN;

        // Create a new array to store the result
        int arr1[] = new int[arr.length];
        int k2 = 0;

        // Alternate between negative and positive numbers
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr1[i] = arr[k2];
               /// System.out.println("arr1[" + i + "] = arr[" + k2 + "] = " + arr[k2]);
                k2++;
            } else {
                arr1[i] = arr[negStart];
              //  System.out.println("arr1[" + i + "] = arr[" + negStart + "] = " + arr[negStart]);
                negStart++;
            }
        }

        // Print the final array
        System.out.println("Final Alternated Array:");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }
}