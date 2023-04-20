class Solution {
    public int solution(int a, int b) {
        String str1=Integer.toString(a);
        String str2=Integer.toString(b);
        int uni=Integer.parseInt(str1+str2);
        return Math.max(uni,2*a*b);
    }
}