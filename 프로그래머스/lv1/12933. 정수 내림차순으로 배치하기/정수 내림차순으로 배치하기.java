import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        String str=Long.toString(n);
        char [] ch=str.toCharArray();
        Arrays.sort(ch);
        for(int i=ch.length-1;i>=0;i--){
            answer+=Character.toString(ch[i]);
        }
        return Long.parseLong(answer);
    }
}

/*class Solution {
    public long solution(long n) {
        long answer = 0;
        String str=Long.toString(n);
        char [] ch=str.toCharArray();
        Arrays.sort(ch);
        for(int i=ch.length-1;i>=0;i--){
            answer+=Long.parseLong(Character.toString(ch[i]));
        }
        return answer;
    }
}*/