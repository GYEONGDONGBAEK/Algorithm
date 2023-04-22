class Solution {
    public int solution(String number) {
        int answer = 0;
        String str[]=number.split("");
        for(int i=0;i<str.length;i++){
            answer+=Integer.parseInt(str[i]);
        }
        return answer%9;
    }
}