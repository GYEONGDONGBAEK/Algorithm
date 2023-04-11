class Solution {
    public String interpret(String command) {
       String answer = command.replace("()", "o").replace("(al)", "al");
       return answer;
    }
}