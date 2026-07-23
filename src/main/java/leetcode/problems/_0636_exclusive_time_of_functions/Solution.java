package leetcode.problems._0636_exclusive_time_of_functions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

class Solution {

    private static final String START = "start";
    private static final String END = "end";

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] output = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        int previousTime = 0;
        for (String log : logs) {
            StringTokenizer tokenizer = new StringTokenizer(log, ":");
            int id = Integer.parseInt(tokenizer.nextToken());
            String action = tokenizer.nextToken();
            int logTime = Integer.parseInt(tokenizer.nextToken());
            if (START.equals(action)) {
                if (!stack.isEmpty()) {
                    int topId = stack.peek();
                    output[topId] += logTime - previousTime;
                }
                stack.push(id);
                previousTime = logTime;
            } else if (END.equals(action)) {
                int endedId = stack.pop();
                output[endedId] += logTime - previousTime + 1;
                previousTime = logTime + 1;
            }
        }
        return output;
    }
}
