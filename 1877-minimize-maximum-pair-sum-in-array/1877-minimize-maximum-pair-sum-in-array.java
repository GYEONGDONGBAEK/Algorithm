import java.util.*;
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int answer=0;
        int left=0;
        int right=nums.length-1;

        while (left<right) {
            int sum = nums[left++] + nums[right--];
            answer=Math.max(answer, sum);
        }
        return answer;
    }
}