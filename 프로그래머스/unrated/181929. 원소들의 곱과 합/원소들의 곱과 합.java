class Solution {
    public int solution(int[] num_list) {
        int answer = 0 , cnt1=1, cnt2=0;
        for(int i=0;i<num_list.length;i++){
            cnt1*=num_list[i];
            cnt2+=num_list[i];
        }
        if(cnt1<cnt2*cnt2) answer=1;
        return answer;
    }
}