import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> st=new Stack<>();
    
        for (int i=0;i<arr.length;i++) {
            if (st.isEmpty()||st.peek()!=arr[i]) {
                st.push(arr[i]);
            }else{
                st.pop();
            }
        }
        
        if(st.isEmpty()) {
            return new int[]{-1};
        }else{
            int[] answer=new int[st.size()];
            for (int j=st.size()-1;j>=0;j--){
                answer[j]=st.pop();
            }
            return answer;
    }
  }
}