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
public class Solution {
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        subTree(root);
        return count;
    }

    private int[] subTree(TreeNode node) {
        if (node == null) return new int[] { 0, 0 };
        

        int[] left = subTree(node.left);
        int[] right = subTree(node.right);

        int sum = node.val + left[0] + right[0];
        int countNodes = 1 + left[1] + right[1];

        if (sum / countNodes == node.val) count++;
        

        return new int[] { sum, countNodes };
    }
}