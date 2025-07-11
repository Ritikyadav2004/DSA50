public class countIsland {
    public static void dfs(int[][]grid,int i,int j)
    {
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0)
       { return;}
        grid[i][j]=0;// mark field
        dfs(grid, i+1, j);//downword
        dfs(grid, i-1, j);//upward
        dfs(grid, i, j+1);//move left side
        dfs(grid, i, j-1);//move right side
    }
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,0,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
        int island=0;
        System.out.println("Grid...");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1)
                {
                    dfs(grid,i,j);
                    island++;
                }
            }
        }
        System.out.println("Number of island:"+island);
    }
}
