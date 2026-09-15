package leetcode.problems._0796_rotate_string;

class Solution {

    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == goal.charAt(0)) {
                if (isSameString(s, goal, i)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean isSameString(String s, String goal, int startIndex) {
        for (int i = startIndex; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i - startIndex)) {
                return false;
            }
        }
        for (int i = 0; i < startIndex; i++) {
            if (s.charAt(i) != goal.charAt(s.length() - startIndex + i)) {
                return false;
            }
        }
        return true;
    }
}
