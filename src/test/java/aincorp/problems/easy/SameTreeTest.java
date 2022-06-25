package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

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

        assertEquals(true, sameTree.isSameTree(p, q));
    }

    @Test
    public void null_test() {
        assertEquals(true, sameTree.isSameTree(null, null));
    }

    @Disabled
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

        assertEquals(false, sameTree.isSameTree(p, q));
    }

    @Test
    public void with_nulls_tree() {
        TreeNode p = new TreeNode(1,
                new TreeNode(2, null, null),
                new TreeNode(1, null, null)
        );

        TreeNode q = new TreeNode(1,
                new TreeNode(1, null, null),
                new TreeNode(2, null, null)
        );

        assertEquals(false, sameTree.isSameTree(p, q));
    }
}