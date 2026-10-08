package leetcode.problems._1021_remove_outermost_parentheses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals("()()()", solution.removeOuterParentheses("(()())(())"));
    }

    @Test
    void sampleCase2() {
        assertEquals("()()()()(())", solution.removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    void sampleCase3() {
        assertEquals("", solution.removeOuterParentheses("()()"));
    }
}
