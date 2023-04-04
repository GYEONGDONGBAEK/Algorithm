class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int ser = 0;
        while(true) {
            ser = chicken / 10;
            chicken = chicken % 10 + ser;
            answer += ser;
            if(chicken < 10) {
                break;
            }
        }
        return answer;
    }
}