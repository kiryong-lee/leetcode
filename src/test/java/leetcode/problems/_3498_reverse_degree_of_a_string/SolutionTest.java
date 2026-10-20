package leetcode.problems._3498_reverse_degree_of_a_string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(148, solution.reverseDegree("abc"));
    }

    @Test
    void sampleCase2() {
        assertEquals(160, solution.reverseDegree("zaza"));
    }
}
