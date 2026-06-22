package leetcode.problems._1189_maximum_number_of_balloons;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(1, solution.maxNumberOfBalloons("nlaebolko"));
    }

    @Test
    void sampleCase2() {
        assertEquals(2, solution.maxNumberOfBalloons("loonbalxballpoon"));
    }

    @Test
    void sampleCase3() {
        assertEquals(0, solution.maxNumberOfBalloons("leetcode"));
    }
}
