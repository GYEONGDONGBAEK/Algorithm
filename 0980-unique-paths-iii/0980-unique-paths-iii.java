class Solution {
    private int res=0;
    public int uniquePathsIII(int[][] grid) {
        int x=0;
        int y=0;
        int zeros=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n; j++){
                if(grid[i][j]==0){
                    zeros++;
                }
                else if(grid[i][j]==1){
                    x=i;
                    y=j;
                }
            }
        }
        dfs(grid,x,y,zeros);
        return res;
    }
    public void dfs(int[][] grid, int i, int j, int zeros){
        if(i<0||i>= grid.length||j<0||j>=grid[0].length||grid[i][j]==-1) return;
        if(grid[i][j]==2&&zeros==-1) res++;
        if(grid[i][j]==2||zeros==-1) return;
        
        grid[i][j]=-1;

        dfs(grid, i-1, j, zeros-1);
        dfs(grid, i+1, j, zeros-1);
        dfs(grid, i, j-1, zeros-1);
        dfs(grid, i, j+1, zeros-1);
        
        grid[i][j] = 0;
    }
}