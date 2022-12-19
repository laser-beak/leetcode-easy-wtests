package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;

import java.util.Stack;

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
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        boolean flag = true;

        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();

        TreeNode currentP;
        pStack.push(p);
        TreeNode currentQ;
        qStack.push(q);

        while (!pStack.isEmpty() && !qStack.isEmpty()) {
            currentP = pStack.pop();
            currentQ = qStack.pop();

            if (currentP != null && currentQ != null) {
                if (currentP.val != currentQ.val) {
                    flag = false;
                }
            } else {
                return false;
            }

            if (currentP.right != null || currentQ.right != null) {
                pStack.push(currentP.right);
                qStack.push(currentQ.right);
            }

            if (currentP.left != null || currentQ.left != null) {
                pStack.push(currentP.left);
                qStack.push(currentQ.left);
            }
        }

        return flag;
    }

    /*public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }*/
}
