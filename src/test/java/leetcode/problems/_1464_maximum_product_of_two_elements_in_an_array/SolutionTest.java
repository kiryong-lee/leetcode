package leetcode.problems._1464_maximum_product_of_two_elements_in_an_array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(12, solution.maxProduct(new int[]{3, 4, 5, 2}));
    }

    @Test
    void sampleCase2() {
        assertEquals(16, solution.maxProduct(new int[]{1, 5, 4, 5}));
    }

    @Test
    void sampleCase3() {
        assertEquals(12, solution.maxProduct(new int[]{3, 7}));
    }
}
