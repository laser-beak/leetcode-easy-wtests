package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class SameTreeTest {
    private final SameTree sameTree = new SameTree();

    @Test
    public void first_test() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2, null, null),
                new TreeNode(3, null, null)
        );

        TreeNode q = new TreeNode(1,
                new TreeNode(2, null, null),
                new TreeNode(3, null, null)
        );

        assertTrue(sameTree.isSameTree(p, q));
    }

    @Test
    public void null_test() {
        assertTrue(sameTree.isSameTree(null, null));
    }

    @Test
    public void reversed_tree() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2, null, null),
                null
        );

        TreeNode q = new TreeNode(1,
                null,
                new TreeNode(2, null, null)
        );

        assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    public void with_nulls_tree() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2, null, null),
                new TreeNode(1, null, null)
        );

        TreeNode q = new TreeNode(1,
                new TreeNode(1, null, null),
                new TreeNode(3, null, null)
        );

        assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    public void trees_not_null() {
        assertTrue(sameTree.isSameTree(new TreeNode(), new TreeNode()));
    }
}