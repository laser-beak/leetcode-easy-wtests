package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    @Test
    void test() {
        assertEquals(0, maximumDepthOfBinaryTree.maxDepth(null));
        assertEquals(1, maximumDepthOfBinaryTree.maxDepth(new TreeNode()));
        assertEquals(2, maximumDepthOfBinaryTree.maxDepth(new TreeNode(1, null, new TreeNode(2))));
        assertEquals(3, maximumDepthOfBinaryTree.maxDepth(new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)))));
        assertEquals(4, maximumDepthOfBinaryTree.maxDepth(new TreeNode(-8, new TreeNode(-6, new TreeNode(6, null, new TreeNode(5)), null), new TreeNode(7))));
    }

}