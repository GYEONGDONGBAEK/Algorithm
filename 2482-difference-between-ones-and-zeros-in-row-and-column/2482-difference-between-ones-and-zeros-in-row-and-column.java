class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int rowzero[] = new int[m];
        int colzero[] = new int[n];
        int rowone[] = new int[m];
        int colone[] = new int[n];
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j < n;j++)
            {
                if(grid[i][j] == 0)
                {
                    rowzero[i]++;
                    colzero[j]++;
                }
                else
                {
                    rowone[i]++;
                    colone[j]++;
                }
            }
        }
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j < n;j++)
            {
            grid[i][j] = rowone[i] + colone[j] - rowzero[i] -colzero[j];
            }
        }
        return grid;
    }
}

//grid[i].length-onesRow == zeroRow