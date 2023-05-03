class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] ch=my_string.toCharArray();
        for(int i=0;i<ch.length;i++){
            if('A'<=ch[i] && ch[i]<='Z'){
                answer[ch[i]-'A']++;
            }else if('a'<=ch[i] && ch[i]<='z'){
                answer[ch[i]-'a'+26]++;
            }
        }
        return answer;
    }
}