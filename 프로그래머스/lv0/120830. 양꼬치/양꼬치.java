class Solution {
    public int solution(int n, int k) {
        boolean limit=(0<n && n<1000 && n/10<=k && k<1000);
        int answer = 0;
        
        if(limit){
            answer=(n*12000+k*2000-n/10*2000);
        }
        return answer;
    }
}