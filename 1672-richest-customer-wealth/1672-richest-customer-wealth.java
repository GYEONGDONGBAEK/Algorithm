class Solution {
    public int maximumWealth(int[][] accounts) {
        int answer=0;
        for(int i=0;i<accounts.length;i++){
            int cnt=0;
            for(int j=0;j<accounts[i].length;j++){
                cnt+=accounts[i][j];
            }
        if(answer<cnt){
            answer=cnt;
            
        }
        }
        
        return answer;
    }
}