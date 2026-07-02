package leetcode.problems._0027_remove_element;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        int[] nums = {3, 2, 2, 3};

        int k = solution.removeElement(nums, 3);

        assertEquals(2, k);
        assertArrayEquals(new int[]{2, 2}, Arrays.copyOf(nums, k));
    }

    @Test
    void sampleCase2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        int k = solution.removeElement(nums, 2);

        assertEquals(5, k);
        assertArrayEquals(new int[]{0, 1, 3, 0, 4}, Arrays.copyOf(nums, k));
    }

    @Test
    void noElementMatchesValue() {
        int[] nums = {1, 2, 3};

        int k = solution.removeElement(nums, 4);

        assertEquals(3, k);
        assertArrayEquals(new int[]{1, 2, 3}, Arrays.copyOf(nums, k));
    }

    @Test
    void allElementsMatchValue() {
        int[] nums = {1, 1, 1};

        int k = solution.removeElement(nums, 1);

        assertEquals(0, k);
        assertArrayEquals(new int[]{}, Arrays.copyOf(nums, k));
    }
}
