package leetcode.problems._0628_maximum_product_of_three_numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(6, solution.maximumProduct(new int[]{1, 2, 3}));
    }

    @Test
    void sampleCase2() {
        assertEquals(24, solution.maximumProduct(new int[]{1, 2, 3, 4}));
    }

    @Test
    void sampleCase3() {
        assertEquals(-6, solution.maximumProduct(new int[]{-1, -2, -3}));
    }
}
