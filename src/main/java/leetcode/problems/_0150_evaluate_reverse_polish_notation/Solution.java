package leetcode.problems._0150_evaluate_reverse_polish_notation;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if ("+".equals(token)) {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left + right);
            } else if ("-".equals(token)) {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left - right);
            } else if ("*".equals(token)) {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left * right);
            } else if ("/".equals(token)) {
                int right = stack.pop();
                int left = stack.pop();
                stack.push(left / right);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
