package leetcode.problems._1441_build_an_array_with_stack_operations;

import java.util.ArrayList;
import java.util.List;

class Solution {

    private static final String PUSH = "Push";
    private static final String POP = "Pop";

    public List<String> buildArray(int[] target, int n) {

        List<String> output = new ArrayList<>();
        int currentNumber = 1;
        for (int t : target) {
            while (currentNumber < t) {
                output.add(PUSH);
                output.add(POP);
                currentNumber++;
            }
            output.add(PUSH);
            currentNumber++;
        }

        return output;
    }
}
