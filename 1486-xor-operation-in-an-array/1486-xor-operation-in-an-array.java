class Solution {
    public int xorOperation(int n, int start) {
        int []nums=new int[n];
        int answer=start;
        for (int i = 0;i<n;i++) {
            nums[i]=start+2*i;
        }
        for(int i=1;i<n;i++){
            answer^=nums[i];
        }
        return answer;
    }
}