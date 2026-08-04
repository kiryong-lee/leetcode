package leetcode.problems._0084_largest_rectangle_in_histogram;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(10, solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

    @Test
    void sampleCase2() {
        assertEquals(4, solution.largestRectangleArea(new int[]{2, 4}));
    }

    @Test
    void rectangleExtendsToTheLeftOfItsOriginalIndex() {
        assertEquals(12, solution.largestRectangleArea(new int[]{1, 5, 4, 6, 2}));
    }
}
