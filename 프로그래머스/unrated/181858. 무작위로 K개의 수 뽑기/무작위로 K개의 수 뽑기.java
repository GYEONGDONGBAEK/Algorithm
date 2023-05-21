import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer=new int[k];
        int cnt=0;

        for (int i=0;i<arr.length&&cnt<k;i++) {
            boolean flag=false;            
            for (int j=0;j<cnt;j++) {
                if (answer[j] == arr[i]) {
                    flag=true;
                    break;
                }
            }
            if (!flag) {
                answer[cnt++]=arr[i];
            }
        }
        while (cnt<k) {
            answer[cnt++] = -1;
        }
        return answer;
    }
}