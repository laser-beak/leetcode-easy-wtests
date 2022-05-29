package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root != null) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            if (left == null && right != null || left != null && right == null) {
                if (left.val == right.val) {

                }
                return false;
            }
            return false;
        }
        return false;
    }
}
