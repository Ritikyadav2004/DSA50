public class magicSquare 
   { public static String magicSquare(int[][] mat){
    int n= mat.length;
        int magicsum=0;
        for(int i=0;i<n;i++)
        {
         magicsum+=mat[0][i];
         
        }
        for(int i=1;i<n;i++)
        {   
            int sum=0;
            for( int j=0;j<n;j++)
            {
                sum+=mat[i][j];
            }
            if(magicsum!=sum)
            {
                return "Not a Magic Square";
            }
        }
        // checkimg columnsum
        for(int j=0;j<n;j++)
        {   
            int colsum=0;
            for(int i=0;i<n;i++)
            {
                colsum+=mat[i][j];
            }
            if(colsum!=magicsum)
            return "Not a Magic Square";
        }
        int dig1=0;
        for(int i=0;i<n;i++)
        {
            dig1+=mat[i][i];
        }
        if(dig1!=magicsum)
        {
            return "Not a Magic Sqaure";
        }
        // chwcking anti iaggonal
        int diag2=0;
        for(int i=0;i<n;i++)
        {
            diag2+=mat[i][n-1-i];
        }
        if(diag2!=magicsum)
        {
            return "Not a Magic Sqaure";
        }
        
        return "Magic Square";
    }
    


    
   
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{3,4,5},{5,6,7}};
        System.out.println(magicSquare(mat));
    }
   }
   