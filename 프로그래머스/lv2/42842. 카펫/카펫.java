class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer=new int[2];
        int total=brown+yellow; // 전체 격자의 수
        // 전체 격자의 수를 i로 나누어 가로 길이와 세로 길이를 구함
        for (int width=3;width<=total/3;width++) {
            int height=total/width;
            if(width<height) continue;

            if (total%width==0&& (width-2)*(height-2)==yellow) {
                answer[0]=width;
                answer[1]=height;
                break;
            }
        }
        return answer;
    }
}

//brown의 갯수 2(m+n)-4
//yellow의 갯수 (n-2)*(m-2)
// brown =x yellow =y
//x=2(m+n)-4 , y=(n-2)*(m-2)
//x+y=m*n
// (n-2)(m-2)=24
// (24,1)(12,2)(6,4)
// (26,3)(14,4)(8,6)