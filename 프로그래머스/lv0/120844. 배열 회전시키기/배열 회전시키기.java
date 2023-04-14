import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int[] tmp=numbers.clone();
        if(direction.equals("right")){
            for(int i=0;i<numbers.length-1;i++){
                answer[i+1]=numbers[i];
            }
            answer[0]=tmp[numbers.length-1];
        }else{
            for(int i=0;i<numbers.length-1;i++){
                answer[i]=numbers[i+1];
            }
            answer[numbers.length-1]=tmp[0];
        }
            
        return answer;
    }
}