class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        for(long i=1;i<=count;i++){
            money-=price*i;
        }
        if(money>0){
            answer=0;
        }else{
            answer=Math.abs(money);
        }

        return answer;
    }
}