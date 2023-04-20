class Solution {
    public String[] solution(String[] names) {
        int n=(int)Math.ceil(names.length/5.0);
        String[] answer = new String[n];
        for(int i=0;i<names.length;i+=5){
            answer[i/5]=names[i];
        }
        return answer;
    }
}