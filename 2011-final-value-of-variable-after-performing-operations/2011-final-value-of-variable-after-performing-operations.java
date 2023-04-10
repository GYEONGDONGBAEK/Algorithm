class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int answer=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("X++")||operations[i].equals("++X")){
                answer+=1;
            }else if(operations[i].equals("X--")||operations[i].equals("--X")){
                answer-=1;
            }
        }
        return answer;
    }
}