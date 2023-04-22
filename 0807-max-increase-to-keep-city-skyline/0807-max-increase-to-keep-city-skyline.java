class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int answer=0;
        int len=grid.length;
        int [] row=new int[len];
        int [] col=new int[len];

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                row[i]=Math.max(row[i],grid[i][j]);
                col[j]=Math.max(col[j],grid[i][j]);
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                answer+=Math.min(row[i],col[j])-grid[i][j];
            }
        }
        return answer;
    }
}

/*
North :9 4 8 7
South: 9 4 8 7
East : 8 7 9 3
West :8 7 9 3
 row_max [8 7 9 3]
 col_max [9 4 8 7]
*/
