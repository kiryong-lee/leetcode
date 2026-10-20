package leetcode.problems._3498_reverse_degree_of_a_string;

class Solution {

    public int reverseDegree(String s) {

        int degree = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            degree += ('z' - c + 1) * (i + 1);
        }

        return degree;
    }
}
