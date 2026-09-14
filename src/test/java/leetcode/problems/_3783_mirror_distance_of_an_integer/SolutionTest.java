package leetcode.problems._3783_mirror_distance_of_an_integer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(27, solution.mirrorDistance(25));
    }

    @Test
    void sampleCase2() {
        assertEquals(9, solution.mirrorDistance(10));
    }

    @Test
    void sampleCase3() {
        assertEquals(0, solution.mirrorDistance(7));
    }
}
