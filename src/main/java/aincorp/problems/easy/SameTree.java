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
        Stack<Integer> pStack = new Stack<>();
        Stack<Integer> qStack = new Stack<>();

        pStack = preOrderTravers(p, pStack);
        qStack = preOrderTravers(q, qStack);

        return pStack.equals(qStack);
    }

    public Stack<Integer> preOrderTravers(TreeNode root, Stack<Integer> stack) {

        if (root != null) {
            stack.push(root.val);
            preOrderTravers(root.left, stack);
            preOrderTravers(root.right, stack);
        }

        return stack;
    }
}
