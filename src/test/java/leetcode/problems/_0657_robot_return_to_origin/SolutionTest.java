package leetcode.problems._0657_robot_return_to_origin;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertTrue(solution.judgeCircle("UD"));
    }

    @Test
    void sampleCase2() {
        assertFalse(solution.judgeCircle("LL"));
    }
}
