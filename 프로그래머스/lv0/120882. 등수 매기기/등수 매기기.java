class Solution {
    public int[] solution(int[][] score) {
        int s=score.length;
        int[] answer = new int[s];
        double [] avg=new double[s];
        for (int i=0;i<s;i++){
            avg[i]=(double)(score[i][0]+score[i][1])/2;
        }
        for (int i=0;i<s;i++) {
            int rank=1;
            for (int j=0;j<s;j++) {
                if (avg[i]<avg[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}