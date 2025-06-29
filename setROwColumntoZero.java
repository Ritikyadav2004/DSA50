public class setROwColumntoZero {
     public static int[] search (int[][]matrix,int elemnt){
        int row = matrix.length;
        int arr[]= new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int column=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {    
                if(matrix[i][j]==elemnt)
                {
                    arr[0]=i;
                    arr[1]=j;
                }
                
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,0}};
        int arr[]=new int[2];
        arr = search(matrix, 0);
        if(arr[0]==-1)
        {
           System.out.println("No Zero Element found");
           return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(arr[0]==i || arr[1]==j)
                {
                    matrix[i][j]=0;
                }
            }
        }
          for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
