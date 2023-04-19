class Solution {
    public int balancedStringSplit(String s) {
        int cnt1=0;
        int cnt2=0;
        int answer=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') {
                cnt1++;
            }else{
                cnt2++;
            }
           if(cnt1==cnt2){
               answer++;
               cnt1=0;
               cnt2=0;
           }
        }
        return answer;
    }
}