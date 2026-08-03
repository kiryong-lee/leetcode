package leetcode.problems._1475_final_prices_with_a_special_discount_in_a_shop;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertArrayEquals(
                new int[]{4, 2, 4, 2, 3},
                solution.finalPrices(new int[]{8, 4, 6, 2, 3}));
    }

    @Test
    void sampleCase2() {
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5},
                solution.finalPrices(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void sampleCase3() {
        assertArrayEquals(
                new int[]{9, 0, 1, 6},
                solution.finalPrices(new int[]{10, 1, 1, 6}));
    }
}
