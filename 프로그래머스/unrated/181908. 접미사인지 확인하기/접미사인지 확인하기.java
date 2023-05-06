class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int len1=my_string.length() , len2=is_suffix.length();
        if(len1>=len2&& my_string.substring(len1-len2).equals(is_suffix)) answer=1;
        return answer;
    }
}