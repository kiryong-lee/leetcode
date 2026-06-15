package leetcode.problems._3120_count_the_number_of_special_characters_i;

class Solution {

    public int numberOfSpecialChars(String word) {

        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for (char c : word.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                lower[c - 'a'] = true;
            } else if ('A' <= c && c <= 'Z') {
                upper[c - 'A'] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lower[i] && upper[i]) {
                count++;
            }
        }

        return count;
    }
}
