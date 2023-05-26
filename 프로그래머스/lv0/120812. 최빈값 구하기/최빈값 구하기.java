class Solution {
    public int solution(int[] array) {
        int[] cnt=new int[1001];
        for(int i=0;i<array.length;i++){
            int index=array[i];
            cnt[index]++;
        }
        int max=0;
        int answer=0;

        for (int i=0;i< cnt.length;i++) {
            if (max<cnt[i]){
                max=cnt[i];
                answer=i;
            } else if (max==cnt[i]) {
                answer = -1;
            }
        }
        return answer;
    }
}