package leetcode.problems._1833_maximum_ice_cream_bars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(4, solution.maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
    }

    @Test
    void sampleCase2() {
        assertEquals(0, solution.maxIceCream(new int[]{10, 6, 8, 7, 7, 8}, 5));
    }

    @Test
    void sampleCase3() {
        assertEquals(6, solution.maxIceCream(new int[]{1, 6, 3, 1, 2, 5}, 20));
    }
}
