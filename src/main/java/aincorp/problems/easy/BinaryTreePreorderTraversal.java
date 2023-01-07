package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;

import java.util.ArrayList;
import java.util.List;
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
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();

        if (root == null) return integers;

        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;
        stack.push(current);

        while (!stack.empty()) {
            current = stack.pop();
            integers.add(current.val);

            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }

        return integers;
    }

    /*public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

    public void preOrder(TreeNode node, List<Integer> list) {
        if (node == null)
            return;

        list.add(node.val);
        preOrder(node.left, list);
        preOrder(node.right, list);

    }*/
}
