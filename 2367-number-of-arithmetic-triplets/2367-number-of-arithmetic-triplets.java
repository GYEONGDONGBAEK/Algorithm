class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                for(int k=j+1;k<len;k++){
                    if(nums[k]-nums[j]==diff &&nums[j]-nums[i]==diff){
                        ans++;
                    }
                }
            }
        }
        System.gc();
        return ans;
    }
}