class Solution {
    public int solution(String myString, String pat) {
        int answer=0;
        int start=0;
        while (true){
            int index=myString.indexOf(pat, start);
            if (index==-1) {
                break;
            }
            answer++;
            start=index+1;
        }
        return answer;
    }
}