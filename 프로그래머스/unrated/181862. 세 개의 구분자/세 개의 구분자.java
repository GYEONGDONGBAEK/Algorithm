class Solution {
    public String[] solution(String myStr) { 
        String[] answer = myStr.replaceAll("[abc]", " ").replaceAll("\\s+", " ").trim().split(" ");
        return answer[0].equals("") ? new String[]{"EMPTY"} : answer;
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
