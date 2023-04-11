class Solution {
    public int minPartitions(String n) {
        int answer=0;

        for(int i=0; i<n.length(); i++){
            int num = n.charAt(i) - '0';
            if(num > answer){
                answer = num;
            }
            if(answer == 9) break;
            
        }
        return answer;
    }
}