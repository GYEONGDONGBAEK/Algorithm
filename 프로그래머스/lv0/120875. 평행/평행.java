class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1=dots[0][0], x2=dots[1][0], x3=dots[2][0], x4=dots[3][0];
        int y1=dots[0][1], y2=dots[1][1], y3=dots[2][1], y4=dots[3][1]; 
        
        if (((double)(x1-x2)/(double)(y1-y2))==((double)(x3-x4)/(double)(y3-y4))) return 1;
        if (((double)(x1-x3)/(double)(y1-y3))==((double)(x2-x4)/(double)(y2-y4))) return 1;
        if (((double)(x1-x4)/(double)(y1-y4))==((double)(x2-x3)/(double)(y2-y3))) return 1;
        return answer;
    }
}

//x2-x1/y2-y1 이 같으면 평행