package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int lHeight = maxDepth(root.left);
            int rHeight = maxDepth(root.right);

            if (lHeight > rHeight) {
                return lHeight + 1;
            } else {
                return rHeight + 1;
            }
        }
    }
}
