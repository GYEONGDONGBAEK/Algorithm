import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (checkValid(s))
                answer++;
            
            s = rotateString(s);
        }
        
        return answer;
    }
    
    private boolean checkValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else
                return false;
        }
        
        return stack.isEmpty();
    }
    
    private String rotateString(String s) {
        StringBuilder rotated = new StringBuilder(s.substring(1));
        rotated.append(s.charAt(0));
        return rotated.toString();
    }
}