class Solution {
    public String solution(String code) {
        StringBuilder sb=new StringBuilder();
        int mode=0;
        for (int i=0;i<code.length();i++) {
            char ch=code.charAt(i);
            if (ch=='1') {
                mode=1-mode;
            } else {
                if (mode==0&&i%2==0) {
                sb.append(code.charAt(i));
            } else if (mode==1&&i%2==1){
                sb.append(code.charAt(i));
            }
          }
        }
        if (sb.length() == 0) {
            return "EMPTY";
        }
        return sb.toString();
    }
}