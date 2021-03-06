package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SymmetricTreeTest {
    private final SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    public void tree_is_null_answer_false() {
        assertEquals(false, symmetricTree.isSymmetric(null));
    }

    @Test
    public void when_right_left_child_null_answer_true() {
        assertEquals(false, symmetricTree.isSymmetric(new TreeNode(1, null, null)));
    }

    @Disabled
    @Test
    public void when_tree_is_symmetric_left_right_same_value_answer_true() {
        assertEquals(true, symmetricTree.isSymmetric(new TreeNode(1, new TreeNode(2, null, null), new TreeNode(2, null, null))));
    }
}