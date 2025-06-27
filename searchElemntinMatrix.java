public class searchElemntinMatrix {
    public static boolean search (int[][]matrix,int elemnt){
        int row = matrix.length;
        int column=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(matrix[i][j]==elemnt)
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
         int elemnt=8;
       
         if(search(matrix, elemnt))
         { System.out.println("Element Found");
           
        }
        else
        {
            System.out.println("Elemnt Not found");
        }
       
        
         
        
    }
}

