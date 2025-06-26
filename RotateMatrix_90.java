public class RotateMatrix_90 {
    public static int[][] rotate(int [][] matrix)
    {   int row = matrix.length;
        int column = matrix[0].length;
        int[][] Nmatrix = new int[column][row];
        
         
        for(int i=0;i<row;i++)
        {
            for(int j=column-1;j>=0;j--)
            {
                Nmatrix[j][row-1-i]=matrix[i][j];
            }
        }
        return Nmatrix;
    }
    public static void main(String[] args) {
    //     int matrix[][]={{1, 2, 3},
    // {4, 5, 6},
    // {7, 8, 9}};
    int [][]matrix = {{1,2},{3,4}};
        int[][] matrix_=rotate(matrix);
        int row = matrix.length;
        int column = matrix[0].length;
        System.out.println("Original Matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("New Matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(matrix_[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }

    
}
