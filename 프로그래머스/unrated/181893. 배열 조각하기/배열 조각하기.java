import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        LinkedList<Integer> list = new LinkedList<>();
         for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for (int i=0;i<query.length;i++) {
            if (i%2==0) {
                // 짝수 인덱스 처리: query[i] + 1부터 끝까지 요소 삭제
                int start=query[i]+1;
                int end=list.size();
                while (start<end) {
                    list.remove(start);
                    end--;
                }
            } else {
                // 홀수 인덱스 처리: 0부터 query[i] - 1까지 요소 삭제
                int end=query[i];
                while (end>0) {
                    list.removeFirst();
                    end--;
                }
            }
        }
        int[] answer=new int[list.size()];
        for (int i=0;i<answer.length;i++) {
            answer[i]=list.get(i);
        }
        return answer;
    }
}

/*
 List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<query.length;i++){
            if(i%2==0){
                for(int j=list.size()-1;j>query[i];j--){
                    list.remove(j);  <= list.size의 값이 바뀌면서 j의값이 변해 일정하게 빠지지않음
                }
            }else{
                for(int k=0;k<query[i];k++){
                    list.remove(k);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
*/