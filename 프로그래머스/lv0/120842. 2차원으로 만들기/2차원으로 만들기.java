class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int [num_list.length/n][n];
        int cnt=0;
        for(int i=0;i<answer.length;i++){
            for(int j=0;j<n;j++){
                answer[i][j]=num_list[cnt];
                cnt++;
            }
        }
        return answer;
    }
}
//num_list[0]=answer[0][0]
//num_list[1]=answer[0][1]
//num_list[2]=answer[1][0]
//num_list[3]=answer[1][1]
//num_list[4]=answer[2][0]
//num_list[5]=answer[2][1]
//num_list[6]=answer[3][0]
//num_list[7]=answer[3][1]