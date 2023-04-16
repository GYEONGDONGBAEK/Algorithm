import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> cnt=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0){
            while(n%i==0){
                n/=i;
            }
            cnt.add(i);
          }
        }
        int[] answer=new int[cnt.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=cnt.get(i);
        }
        return answer;
    }
}