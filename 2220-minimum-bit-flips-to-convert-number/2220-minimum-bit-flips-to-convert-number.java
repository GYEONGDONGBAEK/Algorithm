class Solution {
    public int minBitFlips(int start, int goal) {
        String s=Integer.toBinaryString(start);
        String g=Integer.toBinaryString(goal);
        int ans=0;
        int maxLength=Math.max(s.length(),g.length());
        while (s.length()<maxLength) {
            s="0"+s;
        }
        while (g.length()<maxLength) {
            g="0"+g;
        }
        for (int i=0;i<maxLength;i++) {
            if (s.charAt(i) != g.charAt(i)) {
                ans++;
            }
        }
        return ans;
    }
}