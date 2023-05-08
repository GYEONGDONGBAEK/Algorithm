import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<arr.length;i++) {
            while (!stack.isEmpty()&&stack.peek()>=arr[i]) {
                stack.pop();
            }
            stack.push(arr[i]);
        }
        int[] stk = new int[stack.size()];
        for (int i=stk.length-1;i>=0;i--){
            stk[i] = stack.pop();
        }
        return stk;
    }
}
/*
처음에 while을 안쓰고 if-else를 썼는데, 3번째 조건에서 한번 수행하고 i를 증가시키는게 아니라 만족할때까지 계속 진행시켜야
하는것이라서 while문으로 바꿔서 씀.
*/