class Solution {
    public int solution(int n) {
        int count=Integer.bitCount(n);
        int next=n+1;
        while (Integer.bitCount(next)!=count) {
            next++;
        }
        return next;
    }
}
/*
int answer = 0;
        int count=0
        String s=Integer.toBinaryString(n);
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        for(int i =n+1;i<1000000;i++){
            String next=Integer.toBinaryString(i);
            int cnt=0;
            for(int j=0;j<next.length();j++){
                if(next.charAt(j) == '1') {
                    cnt++;
                }
            }
            if(count==cnt) {
                answer = i;
                break;
            }
        }
        return answer;
*/