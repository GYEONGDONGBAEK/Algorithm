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
    int sum=0;
    int level=0;

    public int sumEvenGrandparent(TreeNode root) {
        recursive(root,null,null,level);
        return sum;
    }

    public void recursive(TreeNode root, TreeNode parent, TreeNode grandParent, int level) {
        if (root!=null) {
            if (grandParent!=null&&level-2>= 0) {
                if (grandParent.val % 2 == 0) {
                    sum += root.val;
                }
            }
            recursive(root.left, root, parent, level+1);
            recursive(root.right, root, parent, level+1);
        }
    }
}