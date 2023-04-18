import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] str=Arrays.copyOf(strings, strings.length);
        for(int i=0;i<str.length;i++){
            str[i]=String.valueOf(strings[i].charAt(n))+str[i];
        }
        Arrays.sort(str);
        for (int i=0;i<answer.length;i++) {
            answer[i]=str[i].substring(1);
        }
        return answer;
    }
}

/*String[] answer = new String[strings.length];
        String[] str=new String[strings.length];
        for(int i=0;i<str.length;i++){
            str[i]+=String.valueOf(strings[i].charAt(n))+strings[i];
        }
        Arrays.sort(str);
        for (int i=0;i<answer.length;i++) {
            answer[i]=str[i].substring(1);
        }
*/
//str의 초기값이 null로 정해짐. 	["ullacar","ullebed","ullusun"]