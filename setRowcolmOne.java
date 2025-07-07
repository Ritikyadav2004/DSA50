public class setRowcolmOne {
    public static void main(String[] args) {
         int [][] matrix = {{1,2,3,6},{4,8,5,6},{7,9,8,2},{9,2,3,4}};
        boolean firstrow=false;
    boolean firstcolm = false;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j]==1)
            {
                if(i==0)firstrow=true;
                if(j==0)firstcolm=true;
                matrix[0][j]=1;
                matrix[i][0]=1;
            }
        }
        
    }
    for (int i = 1; i < matrix.length; i++) {
        for (int j = 1; j < matrix[0].length; j++) {
            if(matrix[i][0]==1||matrix[0][j]==1)
            matrix[i][j]=1;
        }
    }
    if(firstrow)
    {
        for(int i=0;i<matrix[0].length;i++)
        {
            matrix[0][i]=1;
        }
    }
    if(firstcolm)
    for (int i = 0; i < matrix.length; i++) {
        matrix[i][0]=1;
    }
for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
