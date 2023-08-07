package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreePreorderTraversalTest {

    private final BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();

    @Test
    void test() {
        assertEquals(Arrays.asList(), binaryTreePreorderTraversal.preorderTraversal(null));
        assertEquals(Arrays.asList(1), binaryTreePreorderTraversal.preorderTraversal(new TreeNode(1)));
        assertEquals(Arrays.asList(1, 2, 3), binaryTreePreorderTraversal.preorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
    }

}