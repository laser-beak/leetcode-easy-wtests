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
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> traversalStack = new Stack<>();

        TreeNode current = root;

        while (current != null || !traversalStack.isEmpty()) {
            while (current != null) {
                traversalStack.push(current);
                current = current.left;
            }
            current = traversalStack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }

    private List<Integer> postOrderTravers(TreeNode root, List<Integer> input) {
        if (root == null) return input;
        postOrderTravers(root.left, input);
        postOrderTravers(root.right, input);
        input.add(root.val);
        return input;
    }

    private List<Integer> inOrderTravers(TreeNode root, List<Integer> input) {
        if (root == null) return input;
        inOrderTravers(root.left, input);
        input.add(root.val);
        inOrderTravers(root.right, input);
        return input;
    }

    private List<Integer> preOrderTravers(TreeNode root, List<Integer> input) {
        if (root == null) return input;
        input.add(root.val);
        preOrderTravers(root.left, input);
        preOrderTravers(root.right, input);
        return input;
    }
}