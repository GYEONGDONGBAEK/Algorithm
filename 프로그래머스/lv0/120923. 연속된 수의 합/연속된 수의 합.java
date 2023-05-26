class Solution {
    public int[] solution(int num, int total) {
        int[] answer=new int[num];
        int first=(num%2==0)?(total/num)-(num/2)+1:(total/num)-(num/2);

        for (int i=0;i<num;i++) {
            answer[i]=first+i;
        }

        return answer;
    }
}

//total/num 의 몫의 값이 배열 중간값이됨.