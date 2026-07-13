package leetcode.problems._0067_add_binary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals("100", solution.addBinary("11", "1"));
    }

    @Test
    void sampleCase2() {
        assertEquals("10101", solution.addBinary("1010", "1011"));
    }
}
