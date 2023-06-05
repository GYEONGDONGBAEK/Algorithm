import java.util.*;
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
        for(int i=0;i<grid[0].length;i++){
            int max=0;
            for(int j=0;j<grid.length;j++){
                max=Math.max(max,grid[j][i]);
            }
            ans+=max;
        }
        return ans;
    }
}