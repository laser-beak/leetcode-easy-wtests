package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SymmetricTreeTest {
    private final SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    void tree_is_null_answer_false() {
        assertTrue(symmetricTree.isSymmetric(null));
    }

    @Test
    void when_right_left_child_null_answer_false() {
        assertTrue(symmetricTree.isSymmetric(new TreeNode(1, null, null)));
    }

    @Test
    void when_tree_is_symmetric_left_right_same_value_answer_true() {
        assertTrue(symmetricTree.isSymmetric(new TreeNode(1, new TreeNode(2, null, null), new TreeNode(2, null, null))));
    }

    @Test
    void test_is_symmetric() {
        assertTrue(symmetricTree.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)))));
    }

    @Test
    void test_is_symmetric_false() {
        assertFalse(symmetricTree.isSymmetric(new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)))));
    }
}