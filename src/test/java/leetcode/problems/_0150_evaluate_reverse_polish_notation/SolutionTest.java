package leetcode.problems._0150_evaluate_reverse_polish_notation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(9, solution.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

    @Test
    void sampleCase2() {
        assertEquals(6, solution.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }

    @Test
    void sampleCase3() {
        assertEquals(
                22,
                solution.evalRPN(new String[]{
                        "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"
                }));
    }
}
