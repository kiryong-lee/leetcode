package leetcode.problems._1189_maximum_number_of_balloons;

class Solution {

    public int maxNumberOfBalloons(String text) {
        int[] characterCount = new int[26];
        for (char c : text.toCharArray()) {
            characterCount[c - 'a']++;
        }
        int max = Math.min(characterCount[1], characterCount[0]);
        max = Math.min(max, characterCount['l' - 'a'] / 2);
        max = Math.min(max, characterCount['o' - 'a'] / 2);
        max = Math.min(max, characterCount['n' - 'a']);

        return max;
    }
}
