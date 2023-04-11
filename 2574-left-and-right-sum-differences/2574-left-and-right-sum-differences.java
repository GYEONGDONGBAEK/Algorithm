class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int n=nums.length;
        int[] answer=new int[n];
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=0;
        right[n-1]=0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        for(int i=0;i<n;i++){
            answer[i]=Math.abs(left[i]-right[i]);
        }
        return answer;
    }
    
}


//leftSum[0] = 0 , rightSum[n]=0;
//leftSum[1]=nums[0] leftSum[2]=leftSum[1]+num[1] leftSum[3]=leftSum[2]+num[2]
//rightSum[n-1]=nums[n] 
//rightSum[n-2]=rightSum[n-1]+nums[n-1]
//rightSum[n-3]=rightSum[n-2]+nums[n-2]