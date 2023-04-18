class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n=board.length;
        boolean [][]flag= new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==1){
                        flag[i][j]=true;
                    for(int k=-1;k<=1;k++){
                        for(int l=-1;l<=1;l++){
                            int x=i+k , y=j+l;
                            if(x>=0&&x<n&&y>=0&&y<n){
                                flag[x][y]=true;
                            }
                        }
                    }
                }//if(board[i][j]==1)
            }//for(int j=0;j<n;j++)
        }//for(int i=0;i<n;i++)
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(flag[i][j]==false) answer++;
            }
        }
        
        return answer;
    }
}