import java.util.*;
class Solution {
    public String[] solution(String myStr) { 
        String[] split = myStr.split("[abc]");
        List<String> answer = new ArrayList<>();
        for (String s : split) {
        if (!s.isEmpty()) {
            answer.add(s);
            }
        }
        if (answer.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return answer.toArray(new String[0]);
        }
    }
}



/*
        String s=myStr.replaceAll("[abc]", " ").trim();
        String[] answer;
        if(s.length()==0){
            answer=new String[]{"EMPTY"};
        }else{
            answer=s.split(" ");
        }
        return answer;
    }
}
*/
