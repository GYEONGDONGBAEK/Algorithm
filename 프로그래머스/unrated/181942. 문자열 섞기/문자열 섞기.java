class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        String [] strarr1=str1.split("");
        String [] strarr2=str2.split("");
        for(int i=0;i<strarr1.length;i++){
            answer+=strarr1[i]+strarr2[i];
        }
        return answer;
    }
}