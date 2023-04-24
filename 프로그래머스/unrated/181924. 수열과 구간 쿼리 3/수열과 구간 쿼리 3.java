import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        for(int i=0;i<queries.length;i++){
            int x=queries[i][0] , y=queries[i][1];
            int tmp=answer[x];
            answer[x]=answer[y];
            answer[y]=tmp;
        }
        return answer;
    }
}