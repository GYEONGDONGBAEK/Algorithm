
class Solution {
    public String[] solution(String[] quiz) {
            for(int i=0; i<quiz.length; i++){
            String[] str=quiz[i].split(" ");
            int result=Integer.parseInt(str[0])+(Integer.parseInt(str[2])*(str[1].equals("+")?1:-1));
            if(result==Integer.parseInt(str[4])){
                quiz[i]="O";
            }else{
                quiz[i]="X";
            }
        }
        return quiz;
    }
}