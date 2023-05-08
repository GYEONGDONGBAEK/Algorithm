import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int n=arr.length;
        int size=1;
        while (size<n) {
            size*=2;
        }

        int[] answer=Arrays.copyOf(arr, size);
        for (int i=n;i<size;i++) {
            answer[i]=0;
        }
        return answer;
    }
}