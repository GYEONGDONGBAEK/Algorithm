class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int [][] ans= new int[n-2][n-2];
         for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int max=0;
                for(int x=i;x<i+3;x++) {
                    for(int y=j;y<j+3;y++) {
                        max=Math.max(grid[x][y],max);
                    }
                }
                ans[i][j] = max;
            }
        }
        return ans;
    }
}