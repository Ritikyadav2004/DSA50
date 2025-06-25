public class transpose_Matrix {
    public static int[][] tranpose(int [][] matrix)
    {   int row = matrix.length;
        int column = matrix[0].length;
        int[][] Nmatrix = new int[column][row];
        
         
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                Nmatrix[i][j]=matrix[j][i];
            }
        }
        return Nmatrix;
    }
    public static void main(String[] args) {
        int matrix[][]={{1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}};
        int[][] matrix_=tranpose(matrix);
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
