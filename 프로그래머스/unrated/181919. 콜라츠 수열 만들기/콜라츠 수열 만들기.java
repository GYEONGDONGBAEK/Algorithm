class Solution {
    public int[] solution(int n) {
        int len=0;
        int x=n;
        while(x!=1){
            if(x%2==0) x/=2;
            else x=(3*x)+1;
            len++;
        }
        int [] answer=new int[len+1];
        answer[0]=n;
        for(int i=1;i<=len;i++){
            if(answer[i-1]%2==0) answer[i]=answer[i-1]/2;
            else answer[i]=(3*answer[i-1])+1;
        }
        return answer;
    }
}