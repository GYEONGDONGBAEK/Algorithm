class Solution {
    public String solution(String myString) {
        String answer = "";
        String mystring=myString.toLowerCase();
        for(int i=0;i<mystring.length();i++){
            if(mystring.charAt(i)=='a'){
               answer+='A';
            }else{
               answer+=mystring.charAt(i);
        }
    }
        return answer;
    }
}