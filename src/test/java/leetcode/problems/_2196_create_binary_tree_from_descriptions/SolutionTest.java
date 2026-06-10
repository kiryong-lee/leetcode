package leetcode.problems._2196_create_binary_tree_from_descriptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        TreeNode root = solution.createBinaryTree(new int[][]{
            {20, 15, 1},
            {20, 17, 0},
            {50, 20, 1},
            {50, 80, 0},
            {80, 19, 1}
        });

        assertEquals(50, root.val);
        assertEquals(20, root.left.val);
        assertEquals(80, root.right.val);
        assertEquals(15, root.left.left.val);
        assertEquals(17, root.left.right.val);
        assertEquals(19, root.right.left.val);
        assertNull(root.right.right);
    }

    @Test
    void sampleCase2() {
        TreeNode root = solution.createBinaryTree(new int[][]{
            {1, 2, 1},
            {2, 3, 0},
            {3, 4, 1}
        });

        assertEquals(1, root.val);
        assertEquals(2, root.left.val);
        assertNull(root.right);
        assertNull(root.left.left);
        assertEquals(3, root.left.right.val);
        assertEquals(4, root.left.right.left.val);
        assertNull(root.left.right.right);
    }

    @Test
    void customCase1() {
        TreeNode root = solution.createBinaryTree(new int[][]{
            {85, 82, 1},
            {74, 85, 1},
            {39, 70, 0},
            {82, 38, 1},
            {74, 39, 0},
            {39, 13, 1}
        });

        assertEquals(74, root.val);
        assertEquals(85, root.left.val);
        assertEquals(39, root.right.val);
        assertEquals(82, root.left.left.val);
        assertNull(root.left.right);
        assertEquals(38, root.left.left.left.val);
        assertNull(root.left.left.right);
        assertEquals(13, root.right.left.val);
        assertEquals(70, root.right.right.val);
    }
}
