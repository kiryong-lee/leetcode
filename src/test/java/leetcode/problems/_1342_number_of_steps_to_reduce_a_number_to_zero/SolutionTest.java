package leetcode.problems._1342_number_of_steps_to_reduce_a_number_to_zero;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(6, solution.numberOfSteps(14));
    }

    @Test
    void sampleCase2() {
        assertEquals(4, solution.numberOfSteps(8));
    }

    @Test
    void sampleCase3() {
        assertEquals(12, solution.numberOfSteps(123));
    }
}
