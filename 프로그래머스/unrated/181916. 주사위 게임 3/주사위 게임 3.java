import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = new int[] {a, b, c, d};
        Arrays.sort(dice);
        int score = 0;
        if (dice[0]==dice[3]) {  
            score=1111*dice[0];
        }else if(dice[0]==dice[2]||dice[1]==dice[3]){  
            int p = dice[1];
            int q =(dice[0]==p)?dice[3]:dice[0];
            score =(int)Math.pow(10*p+q,2);
        }else if (dice[0]==dice[1] &&dice[2]==dice[3]){ 
            int p = dice[0];
            int q = dice[2];
            score=(p+q)*Math.abs(p-q);
        }else if(dice[0]==dice[1]&&dice[2]!=dice[3]){
            int q=dice[2];
            int r=dice[3];
            score=q*r;
        }else if(dice[1]==dice[2]){
            int q=dice[0];
            int r=dice[3];
            score=q*r;
        }else if(dice[2]==dice[3]&&dice[0]!=dice[1]){
            int q=dice[0];
            int r=dice[1];
            score=q*r;
        }else{
            score = dice[0];
        }

        return score;
    }
}