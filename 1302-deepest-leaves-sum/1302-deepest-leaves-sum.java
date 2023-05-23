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
    int maxDepth=0;
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        calculateSum(root,0);
        return sum;
    }

    private void calculateSum(TreeNode node, int depth) {
        if (node==null) {
            return;
        }

        if (depth>maxDepth) {
            maxDepth=depth;
            sum=0;
        }

        if (depth==maxDepth) {
            sum+=node.val;
        }

        calculateSum(node.left,depth+1);
        calculateSum(node.right,depth+1);
        
    }
}
/*
1 ->2,3  5->10,11
2 ->4,5  6->12,13
3 ->6,7  7->14,15
4 ->8,9    2^n-1
*/