class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int idx=0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals(" ")){
                idx=0;
            }
            else if(idx%2==0){
                str[i]=str[i].toUpperCase();
                idx++;
            }
            else if(idx%2!=0){
                str[i]=str[i].toLowerCase();
                idx++;
            }
            answer+=str[i];
        }
        return answer;
    }
}




/*String answer = "";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                ch[i]=Character.toUpperCase(ch[i]);
            }
            answer+=ch[i];
        }
        return answer;
    }
}*/ 
//문제점 :공백이 여러개일수도 있다. 단어 앞 뒤로 공백이 있을시에는 인덱스 번호가 바뀐다.
//해결 : 공백을 범위로 나누고 그 인덱스를 다시 다른 배열로 나눠서 대문자로 변환한다 ?
/*
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            
            for(int j=0;j<word.length();j++){
                if(j%2==0){
                    answer+=Character.toUpperCase(word.charAt(j));
                }else{
                    answer+=word.charAt(j);
                }
            }
            answer+=" ";
        }
        return answer
*/ //맨뒤에 공백이 하나있어서 trim() 해줘야함.


