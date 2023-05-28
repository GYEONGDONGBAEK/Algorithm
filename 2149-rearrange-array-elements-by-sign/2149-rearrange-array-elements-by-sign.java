class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int[] ans=new int[len];
        int[] positive=new int[len/2];
        int[] negative=new int[len/2];
        int pcnt=0 , ncnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) positive[pcnt++]=nums[i];
            else negative[ncnt++]=nums[i];
        }
        int acnt=0;
        for(int i=0;i<len/2;i++){
            ans[acnt++]=positive[i];
            ans[acnt++]=negative[i];
        }
        return ans;
    }
}