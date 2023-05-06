class Solution {
    public int[] solution(int[] arr, int n) {
        int k=arr.length;
        int[] answer=new int[k];
        if(k%2==1){
            for(int i=0;i<k;i++){
                if(i%2==0) answer[i]=arr[i]+n;
                else answer[i]=arr[i];
            }
        }else{
            for(int i=0;i<k;i++){
                if(i%2==1) answer[i]=arr[i]+n;
                else answer[i]=arr[i];
            }
        }
        return answer;
    }
}