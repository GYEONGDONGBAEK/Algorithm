class Solution {
    public int solution(int n) {
        int answer = 0;
        String s=Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(s);
        String rev=sb.reverse().toString();
        
        return Integer.parseInt(rev, 3);
    }
}

//Integer.parseInt(i, N); N진법으로 적힌 i를 10진법으로 바꾸는 법.