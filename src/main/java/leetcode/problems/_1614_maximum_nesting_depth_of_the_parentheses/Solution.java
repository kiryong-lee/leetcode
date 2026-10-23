package leetcode.problems._1614_maximum_nesting_depth_of_the_parentheses;

class Solution {

    public int maxDepth(String s) {
        int maxDepth = 0;
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (c == ')') {
                depth--;
            }
        }

        return maxDepth;
    }
}
