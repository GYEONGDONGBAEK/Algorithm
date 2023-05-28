import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] splitArr=myString.split("x");
        String[] answer=new String[splitArr.length];
        int index = 0;
        for (String str:splitArr) {
            if (!str.isEmpty()) {
                answer[index]=str;
                index++;
            }
        }
        Arrays.sort(answer,0,index);
        return Arrays.copyOfRange(answer,0,index);
    }
}