package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        isBalanced(root.left);
        isBalanced(root.right);

        if (root.left != null && root.right != null && root.left.val == root.right.val) {
            return false;
        }

        return true;
    }
}
