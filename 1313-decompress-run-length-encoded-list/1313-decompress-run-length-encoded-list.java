class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0, k=0;
        for(int i=0;i<nums.length-1;i+=2){
            len+=nums[i];
        }
        int ans[]=new int[len];        
        for(int i=0;i<nums.length-1;i+=2){
            for(int j=nums[i]; j>0; j--){
                ans[k] = nums[i+1];
                k++;
            }
        }
        return ans;
    }
}