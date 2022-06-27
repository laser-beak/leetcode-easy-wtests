package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeInorderTraversalTest {

    private final BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

    @Test
    public void when_tree_is_null() {
        List<Integer> result = new ArrayList<>();
        assertEquals(result, binaryTreeInorderTraversal.inorderTraversal(null));
    }

    @Test
    public void when_tree_is_one_have_node() {
        TreeNode input = new TreeNode(1, null, null);
        List<Integer> result = new ArrayList<>();
        result.add(1);
        assertEquals(result, binaryTreeInorderTraversal.inorderTraversal(input));
    }

    @Test
    public void when_tree_is_not_null() {
        TreeNode input = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(3);
        result.add(2);
        assertEquals(result, binaryTreeInorderTraversal.inorderTraversal(input));
    }

}