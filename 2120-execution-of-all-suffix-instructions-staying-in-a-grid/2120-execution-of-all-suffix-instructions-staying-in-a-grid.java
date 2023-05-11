class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int ans[]=new int[s.length()];

        for(int i=0;i<s.length();i++){
            int cnt=0;
            int y=startPos[0];
            int x=startPos[1];
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='R') x++;
                if(s.charAt(j)=='L') x--;               
                if(s.charAt(j)=='U') y--;               
                if(s.charAt(j)=='D') y++;

                if(x<0 || x>=n || y<0 || y>=n){
                    break;
                }
                else{
                    cnt++;
                }
            } 
            ans[i]=cnt;
        }
        return ans;
    }
}