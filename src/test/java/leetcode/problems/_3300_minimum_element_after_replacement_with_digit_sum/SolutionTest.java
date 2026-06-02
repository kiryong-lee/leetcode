package leetcode.problems._3300_minimum_element_after_replacement_with_digit_sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        int actual = solution.minElement(new int[]{10, 12, 13, 14});

        assertEquals(1, actual);
    }

    @Test
    void sampleCase2() {
        int actual = solution.minElement(new int[]{1, 2, 3, 4});

        assertEquals(1, actual);
    }

    @Test
    void sampleCase3() {
        int actual = solution.minElement(new int[]{999, 19, 199});

        assertEquals(10, actual);
    }
}
