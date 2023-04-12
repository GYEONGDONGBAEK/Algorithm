class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int cnt=0;
        int y=x;
        while(x>0){
            cnt+=x%10;
            x/=10;
        }
        if(y%cnt==0){
            answer=true;
        }
        return answer;
    }
}