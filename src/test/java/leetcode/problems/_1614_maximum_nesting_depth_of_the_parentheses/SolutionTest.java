package leetcode.problems._1614_maximum_nesting_depth_of_the_parentheses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(3, solution.maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    @Test
    void sampleCase2() {
        assertEquals(3, solution.maxDepth("(1)+((2))+(((3)))"));
    }

    @Test
    void sampleCase3() {
        assertEquals(3, solution.maxDepth("()(())((()()))"));
    }
}
