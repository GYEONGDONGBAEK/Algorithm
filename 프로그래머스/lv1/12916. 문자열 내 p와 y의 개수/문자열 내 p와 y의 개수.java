class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int p=0, y=0;
        String []arr=s.toLowerCase().split("");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("p")){
                p++;
            }else if(arr[i].equals("y")){
                y++;
            }
        }
        if(p==y){
            answer=true;
        }
        return answer;
    }
}