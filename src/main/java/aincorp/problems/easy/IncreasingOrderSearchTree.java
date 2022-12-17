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
public class IncreasingOrderSearchTree {

    public TreeNode increasingBST(TreeNode root) {
        //printInorder(root);


        for (int i = 0; i < 10; i++) {

        }

        return null;
    }

    void printInorder(TreeNode node) {
        if (node == null) {
            return;
        }
        /* first recur on left child */
        printInorder(node.left);
        /* then print the data of node */
        System.out.print(node.val + " ");
        /* now recur on right child */
        printInorder(node.right);
    }
}
