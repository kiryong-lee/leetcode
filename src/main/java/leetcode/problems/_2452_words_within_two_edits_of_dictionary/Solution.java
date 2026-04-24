package leetcode.problems._2452_words_within_two_edits_of_dictionary;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> twoEditWords(String[] queries, String[] dictionary) {

        List<String> output = new ArrayList<>();

        for (String query : queries) {
            for (String word : dictionary) {
                if (isWithinTwoEdits(query, word)) {
                    output.add(query);
                    break;
                }
            }
        }

        return output;
    }

    public boolean isWithinTwoEdits(String query, String word) {
        int diffCount = 0;
        for (int i = 0; i < query.length(); i++) {
            if (query.charAt(i) != word.charAt(i)) {
                diffCount++;
                if (diffCount > 2) {
                    return false;
                }
            }
        }
        return true;
    }
}

