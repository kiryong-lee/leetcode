package leetcode.problems._3838_weighted_word_mapping;

class Solution {

    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            int weight = 0;
            for (char c : word.toCharArray()) {
                weight += weights[c - 'a'];
            }
            result.append((char) ('z' - weight % 26));
        }

        return result.toString();
    }
}
