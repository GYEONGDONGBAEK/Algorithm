class Solution {
    public int solution(int balls, int share) {
        long answer = 1L;
        int cnt=1;
        while(cnt<=share){
            answer *=balls--;
            answer/= cnt++;
        }
        
        return (int)answer;
    }
}

//5C3 5C2 5*4*3/3*2*1
// balls = 20 share = 5
// 20*19*18*17*16 / 5*4*3*2*1