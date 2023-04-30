class Solution {
    public int countDigits(int num) {
        int answer=0 , n=num;
        while(n>0){
            int rest=n%10;
            n/=10;
            if(num%rest==0) answer++;
        }
        return answer;
    }
}