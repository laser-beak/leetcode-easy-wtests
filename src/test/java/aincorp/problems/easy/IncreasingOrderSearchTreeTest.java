package aincorp.problems.easy;

import aincorp.problems.easy.models.TreeNode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
class IncreasingOrderSearchTreeTest {

    private final IncreasingOrderSearchTree increasingOrderSearchTree = new IncreasingOrderSearchTree();

    @Test
    public void test() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(1), null),
                        new TreeNode(4)),
                new TreeNode(6, null,
                        new TreeNode(8,
                                new TreeNode(7),
                                new TreeNode(9)
                        )
                )
        );

        TreeNode result =
                new TreeNode(1, null,
                        new TreeNode(2, null,
                                new TreeNode(3, null,
                                        new TreeNode(4, null,
                                                new TreeNode(5, null,
                                                        new TreeNode(6, null,
                                                                new TreeNode(7, null,
                                                                        new TreeNode(8, null,
                                                                                new TreeNode(9)))))))));

        assertTrue(result.equals(increasingOrderSearchTree.increasingBST(root)));
    }

}