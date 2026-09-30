package leetcode.problems._3536_maximum_product_of_two_digits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(3, solution.maxProduct(31));
    }

    @Test
    void sampleCase2() {
        assertEquals(4, solution.maxProduct(22));
    }

    @Test
    void sampleCase3() {
        assertEquals(8, solution.maxProduct(124));
    }
}
