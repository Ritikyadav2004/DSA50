public class searchingin_Matrix {
    public static void main(String[] args) {
         int [][] matrix = {{0,1,3,6},{7,8,9,16},{17,19,82,100}};
         int i=matrix.length*matrix[0].length-1;
         int j=0;
         int target = 82;
         boolean found=false;
         int cols=matrix[0].length;
         while (j<=i) {
            int mid=(i+j)/2;
            int row=mid/cols;
            int col=mid%cols;
            if(matrix[row][col]==target)
            {
                System.out.println("Element Present.");
                found=true;
                break;
            }
            else if(matrix[row][col]<target)
            {
                j=mid+1;
            }
            else
            {
                i=mid-1;
            }

            
         }
         if(!found)System.out.println("Element not found");

    }
}

