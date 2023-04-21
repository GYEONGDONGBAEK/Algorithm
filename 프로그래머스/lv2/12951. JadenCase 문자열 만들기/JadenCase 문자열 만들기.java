class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        for (int i=0;i<str.length;i++) {
            if(str[i].length()==0) answer+=" ";
            else{
                answer+=str[i].substring(0,1).toUpperCase();
                answer+=str[i].substring(1,str[i].length()).toLowerCase();
                answer+=" ";
            }
        }
        if(s.substring(s.length()-1,s.length()).equals(" ")) return answer;
        return answer.trim();
    }
}

/*
String answer = "";
        String [] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            answer+=Character.toUpperCase(str[i].charAt(0));
            for(int j=1;j<str[i].length();j++){
                answer+=Character.toLowerCase(str[i].charAt(j));
            }
            answer+=" ";
        }
        return answer.trim();
    }
}
*/
//맨뒤에 공백이 있을수도 있다.