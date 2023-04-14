import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        int min = sides[0];
        int max = sides[1];
        for(int i=max-min+1 ; i<max+min;i++){
	            answer+=1;
        }
        return answer;
    }
}

//int[1] 이 최대값일때랑 최대값이 아닐때랑 구분해서 구해야함