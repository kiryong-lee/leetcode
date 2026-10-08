package leetcode.problems._3090_maximum_length_substring_with_two_occurrences;

class Solution {

    public int maximumLengthSubstring(String s) {

        int[] charCount = new int[26];
        int left = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int charIndex = c - 'a';
            while (charCount[charIndex] == 2) {
                char removed = s.charAt(left);
                charCount[removed - 'a']--;
                left++;
            }
            charCount[charIndex]++;
            maxLength = Math.max(maxLength, i - left + 1);
        }

        return maxLength;
    }
}
