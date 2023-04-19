class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min=Math.min(n,m);
        int max=Math.max(n,m);
        int a=min, b=max;
        while(a!=0){
            int r=b%a;
            b=a;
            a=r;
        }
        answer[0]=b;
        answer[1]=(max*min)/b;
        return answer;
    }
}