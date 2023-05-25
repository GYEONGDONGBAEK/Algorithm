class Solution {
    public int solution(String A, String B) {
        if (A.length()!=B.length()) return -1;
        if (A.equals(B)) return 0;
        int a=A.length();
        for (int i=0;i<a;i++) {
            String str=A.substring(a-i)+A.substring(0,a-i);
            if (str.equals(B)) return i; 
        }
        return -1;
    }
}