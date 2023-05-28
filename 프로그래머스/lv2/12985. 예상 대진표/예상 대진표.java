class Solution{
    public int solution(int n, int a, int b){
        int answer = 0;
        int max=Math.max(a,b), min=Math.min(a,b);
        while(min<max){
            answer++;
            if(min%2==1) min+=1;
            if(max%2==1) max+=1;
            min/=2;
            max/=2;
        }
        return answer;
    }
}