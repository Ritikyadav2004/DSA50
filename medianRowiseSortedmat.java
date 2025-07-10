public class medianRowiseSortedmat
{
    public static void main(String[] args) {
         int [][] matrix = {{0,1,3,6},{7,8,9,16},{17,19,82,100}};
         int start=0;
         int end = matrix.length*matrix[0].length-1;
         int mid=(start+end)/2;
         int cols=matrix[0].length; //4
         int row=mid/cols;
         int col=mid%cols;
         System.out.println("Middle Elemnt "+matrix[row][col]);

    }
}