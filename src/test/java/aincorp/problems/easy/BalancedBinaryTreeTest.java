package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
class BalancedBinaryTreeTest {

    private BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

    @Test
    void treeIsNull() {
        assertTrue(balancedBinaryTree.isBalanced(null));
    }

    @Test
    void treeIsBalanced() {
        assertTrue(balancedBinaryTree.isBalanced(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    @Test
    void treeNotBalanced() {
        assertFalse(balancedBinaryTree.isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2))));
    }

    @Ignore
    @Test
    void treeOneSideNotBalanced() {
        assertFalse(balancedBinaryTree.isBalanced(new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)))));
    }

}