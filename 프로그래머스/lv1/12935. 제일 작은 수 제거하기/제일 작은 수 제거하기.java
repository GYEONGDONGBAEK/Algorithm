class Solution {
    public int[] solution(int[] arr) {
        int min=arr[0];
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }
        for (int i=1; i<arr.length;i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        int[] answer=new int[arr.length-1];
        int index=0;
        for (int i=0;i<arr.length;i++) {
            if(arr[i]!=min){
                answer[index++]=arr[i];
            }
        }
        return answer;
    }
}



//새로운 배열을 하나 선언해서 제일 작은수를 제거한 뒤 리턴한다.
//리스트로 만들어서 하나 제거하고 그걸 다시 배열로 만든다.
//Math.min 을 써서 제일 작은값을 구하고

/*class Solution {
    public int[] solution(int[] arr) {
        int cnt=0;
        int []answer;
        for(int i=1;i<arr.length;i++){
            cnt=Math.min(arr[i-1],arr[i]);
        }
        if(arr.length==1){
            answer =new int[arr.length];
            answer[0]=-1;
        }else{
            answer = new int[arr.length-1];
            int index = 0;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]!=cnt){
                    answer[index]=arr[i];
                    index++;
            }
        }
        }
        return answer;
    }

}*/