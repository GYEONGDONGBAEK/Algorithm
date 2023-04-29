class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length; int cnt=0;
        int [] ans=new int[n];
        
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ans[cnt++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                ans[cnt++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                ans[cnt++]=nums[i];
            }
        }
        System.gc();
        return ans;
    }
}