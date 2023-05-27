import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> result=new ArrayList<>();
        int count=0;

        for (char c:myString.toCharArray()) {
            if (c=='x') {
                result.add(count);
                count=0;
            } else {
                count++;
            }
        }
        result.add(count);

        int[] answer=new int[result.size()];
        for (int i=0;i<result.size();i++) {
            answer[i]=result.get(i);
        }
        return answer;
    }
}