/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
    
         return BTree(nums,0,nums.length-1);
    }
    
    private TreeNode BTree(int[] nums, int start, int end) {
        if (start>end) return null;
        

        int max=-1;
        int maxindex=0;
        for (int i=start;i<=end;i++) {
            if (nums[i]>max) {
                max=nums[i];
                maxindex=i;
            }
        }

        TreeNode root = new TreeNode(max);
        root.left = BTree(nums, start, maxindex-1);
        root.right = BTree(nums, maxindex+1,end);

        return root;
    }
    
}