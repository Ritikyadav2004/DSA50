public class snakepatternmatrix
{   
    public static void print_Snake_Pattern(int matrix[][])
    {
        
        int row=matrix.length;
        int cols=matrix[0].length;

        for (int i = 0; i < row; i++) {
            if(i%2==0)
            {
            //left to right
            for(int j=0;j<cols;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            }
            else{
                //right to left
                for(int j=cols-1;j>=0;j--)
                {
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }

    }
    public static void main(String str[])
    {
     int[][] matrix  = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
     print_Snake_Pattern(matrix);
    }
}