class Solution {
    public String[] solution(String[] str_list) {
        int cnt=0;
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].equals("l")||str_list[i].equals("r")) {
                cnt=i;
                break;
            }
        }
        String[] answer;
        if(str_list[cnt].equals("l")){
            answer=new String[cnt];
            for(int j=0;j<cnt;j++){
                answer[j]=str_list[j];
            }
        }else if(str_list[cnt].equals("r")){
            answer=new String[str_list.length-cnt-1];
            for(int j=cnt+1;j<str_list.length;j++){
                answer[j-cnt-1]=str_list[j];
            }
        }else{
            answer=new String[0];
        }
        return answer;
    }
}