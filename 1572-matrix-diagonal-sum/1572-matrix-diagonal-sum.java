class Solution {
    public int diagonalSum(int[][] mat) {
        int ans=0;
        int m=mat.length;
        if(m%2==0){
            for(int i=0;i<m;i++){
                ans+=mat[i][i];
                ans+=mat[i][m-i-1];
            }  
        }else{
            for(int i=0;i<m;i++){
                ans+=mat[i][i];
                ans+=mat[i][m-i-1];
            }
            ans-=mat[m/2][m/2];
        }
        return ans;
    }
}