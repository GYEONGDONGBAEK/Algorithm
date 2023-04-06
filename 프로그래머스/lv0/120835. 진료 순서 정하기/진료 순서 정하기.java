import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        //clone은 object에 사용. 배열일땐 copyOf를 쓰도록하자.
        int[] e1=Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(e1);
        // e1 = [3,24,76]
        for(int i=0;i<emergency.length;i++){
            for(int j=0;j<e1.length;j++){ // 
                if(emergency[i]==e1[j]){
                    answer[j]=emergency.length-i;
                }
            }
        }
        return answer;
    }
}

// emergency와 똑같은 배열을 만들어서 내림차순으로 만들어
// emergency와 값을 비교해서 그값이 있는 위치가 answer의 인덱스가 됨.