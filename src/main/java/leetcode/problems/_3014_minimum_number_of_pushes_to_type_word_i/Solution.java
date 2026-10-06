package leetcode.problems._3014_minimum_number_of_pushes_to_type_word_i;

class Solution {

    public int minimumPushes(String word) {

        int answer = word.length();
        if (word.length() > 8) {
            answer += word.length() - 8;
        }
        if (word.length() > 16) {
            answer += word.length() - 16;
        }
        if (word.length() > 24) {
            answer += word.length() - 24;
        }

        return answer;
    }
}
