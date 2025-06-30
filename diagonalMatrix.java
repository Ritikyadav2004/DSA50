public class diagonalMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
         for(int i=0;i<matrix.length;i++)
         {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i==j)
                {
                    System.out.println(matrix[i][j]);
                }
            }
         }
         for(int i=matrix.length-1;i>=0;i--)
         {
            for(int j=matrix[0].length-1;j>=0;j--)
            {   if(i+j==matrix.length-1)
                System.out.println(matrix[i][j]);
            }
         }
    }
    
}
