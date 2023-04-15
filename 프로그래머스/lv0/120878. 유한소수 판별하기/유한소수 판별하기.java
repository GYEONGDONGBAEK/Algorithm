class Solution {
    public int solution(int a, int b) {
        int answer=1;
        int max=Math.max(a,b) , min=Math.min(a,b);
        int max1=max;
        while(max%min!=0){
            int tmp= max;
            max= min;
            min=tmp%min;
        }
        b=b/min;
        while(b!=1){
            if(b%2==0) b/=2;
            else if(b%5==0) b/=5;
            else return answer=2;
        }
        return answer;
    }
}


/* public int solution(int a, int b) {
        int answer=2 , gcb=0;
        int max=Math.max(a,b) , min=Math.min(a,b);
        int max1=max
        while(max%min!=0){
            int tmp= max;
            max= min;
            min=tmp%min;
        }
        if((max1/min)%2==0||(max1/min)%5==0){
            answer=1;
        }
        return answer;
    }
}*/
// 2,5, 2와5가 아닌 다른수를 소인수로 가져도 answer가 1이됨.
