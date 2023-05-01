class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        if(n==1){
            int cnt=slicer[1];
            int [] answer=new int[cnt+1];
            for(int i=0;i<=cnt;i++){
                answer[i]=num_list[i];   
            }
            return answer;
        }else if(n==2){
            int cnt=slicer[0];
            int [] answer=new int[num_list.length-cnt];
            for(int i=0;i<answer.length;i++){
               answer[i]=num_list[cnt+i];
            }
            return answer;
        }else if(n==3){
            int [] answer=new int[slicer[1]-slicer[0]+1];
            for(int i=0;i<answer.length;i++){
               answer[i]=num_list[slicer[0]+i];
            }
            return answer;
        }else{
            int[] answer=new int[(slicer[1]-slicer[0])/slicer[2] +1];
            int index=0;
            for (int i=slicer[0];i<=slicer[1];i+=slicer[2]){
                answer[index++] = num_list[i];
            }
            return answer;
        }
    }
}