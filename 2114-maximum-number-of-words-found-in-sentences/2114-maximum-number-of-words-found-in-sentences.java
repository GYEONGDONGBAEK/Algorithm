class Solution {
    public int mostWordsFound(String[] sentences) {
        int answer=0;
        for(int i=0;i<sentences.length;i++){
            int cnt=0;
            String[] arr=sentences[i].split(" ");
            cnt=arr.length;
         if(answer<cnt){
             answer=cnt;
         }
            
        }
        return answer;
    }
}