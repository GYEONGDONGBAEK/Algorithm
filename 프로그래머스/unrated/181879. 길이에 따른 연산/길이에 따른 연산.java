class Solution {
    public int solution(int[] num_list) {
        int answer = 0 , cnt=1 ,len=num_list.length;
        for(int i=0;i<len;i++){
            if(len>10) answer+=num_list[i];
            else {
                cnt*=num_list[i];
                answer=cnt;
            }
            
        }
        return answer;
    }
}