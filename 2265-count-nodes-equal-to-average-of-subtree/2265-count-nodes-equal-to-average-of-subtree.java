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
    int[] count = new int[1];
    public int averageOfSubtree(TreeNode root) {
        SubTree(root, count);
        return count[0];
    }

    private int[] SubTree(TreeNode node, int[] count) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = SubTree(node.left, count);
        int[] right = SubTree(node.right, count);

        int sum = node.val + left[0] + right[0];
        int countNodes = 1 + left[1] + right[1];

        if (sum / countNodes == node.val) {
            count[0]++;
        }

        return new int[]{sum, countNodes};
    }
}   
    