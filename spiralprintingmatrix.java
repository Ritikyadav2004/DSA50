public class spiralprintingmatrix
{

public static void main(String[] args) {
    int[][] matrix ={{1,2,3},{4,5,6},{7,8,9}};

    int RowBegin=0;
    int RowEnd =  matrix.length-1;
    int ColBegin=0;
    int ColEnd= matrix[0].length-1;
    while(RowBegin<=RowEnd)
    {
        //Trvaerse Rigth
        for (int i = ColBegin; i <=ColEnd; i++) {
            System.out.print(matrix[RowBegin][i]+" ");
        }
        RowBegin++;

        //travesreing down
        for (int i = RowBegin; i <=RowEnd; i++) {
            System.out.print(matrix[i][ColEnd]+" ");
        }
        ColEnd--;
        //move left
        if(RowBegin<=RowEnd)
        {
            for (int i=ColEnd ; i >=ColBegin; i--) {
                System.out.print(matrix[RowEnd][i]+" ");
            }
            RowEnd--;
        }
        //move up
        if(ColBegin<=ColEnd)
        {
          for(int i=RowEnd;i>=RowBegin;i--)
          {
            System.out.print(matrix[i][ColBegin]+" ");
          }
          ColBegin++;
        }
    }
}
}