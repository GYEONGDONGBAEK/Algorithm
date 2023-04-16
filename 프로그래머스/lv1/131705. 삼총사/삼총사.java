class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                for(int k=j+1;k<number.length;k++){
                    if(number[i]+number[j]+number[k]==0) answer++;
                }
            }
        }
        return answer;
    }
}
//012 013 014
//123 124
//234

//012 013 014 015 016
//123 124 125 126
//234 235 236
//345 346
//456