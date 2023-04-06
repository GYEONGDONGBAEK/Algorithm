class Solution {
    public int solution(int n) {
        int answer =1;
        int i=0;
        for(int j=1;j<=10;j++){
            if(answer*j<=n){
                answer*=j;
                i= j;
            }
        }
        return i;
    }
}

        