class Solution {
    public int[] runningSum(int[] nums) {
        int[] output=new int[nums.length];
        int cnt=0;
        
         for(int i=0; i<nums.length; i++) {
            cnt +=  nums[i];
            output[i] = cnt;
        }
        return output;
    }
}