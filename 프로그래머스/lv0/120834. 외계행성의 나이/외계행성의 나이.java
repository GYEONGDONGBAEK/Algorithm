class Solution {
    public String solution(int age) {
        String answer = "";
        int i=0;
        char [] chage={'a','b','c','d','e','f','g','h','i','j'};
        while(age>0){
            answer=chage[age%10]+answer;
            age=age/10;
        }
        
        return answer;
    }
}