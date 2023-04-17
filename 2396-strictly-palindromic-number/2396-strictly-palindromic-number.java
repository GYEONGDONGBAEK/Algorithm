class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean answer=true;
        String str=Integer.toString(n);
        for(int i=2;i<=n-2;i++){
            String str1="";
            int div=n;
            while(div>0){
                str1+=div%i;
                div/=n;
            }
        int cnt=str1.length();
        for(int j=0;j<cnt/2;j++){
            if (str1.charAt(j)!=str1.charAt(cnt-1-j)){
                    answer=false;
                    break;
                }
        }
        }
        System.gc();
        return answer;
    }
}

//회문 :완전히 대칭일때 1001, 101 같은수
//주어진 수를 2진수부터 n-2 진수까지 변환했을때 그게 다 회문이면 true, 아니라면 false반환
//n이 