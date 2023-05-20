class Solution {
    public int solution(String A, String B) {
        if (A.length()!=B.length()) return -1;
        if (A.equals(B)) return 0;
    
        for (int i=0;i<A.length();i++) {
            String shifted = A.substring(A.length()-i) + A.substring(0,A.length()-i);
            if (shifted.equals(B)) return i; 
        }
        return -1;
    }
}