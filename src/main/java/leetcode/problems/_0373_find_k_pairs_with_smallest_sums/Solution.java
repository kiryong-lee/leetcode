package leetcode.problems._0373_find_k_pairs_with_smallest_sums;

import java.util.*;

class Solution {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        Queue<Candidate> minHeap = new PriorityQueue<>(
                Comparator.comparingLong(
                        candidate -> (long) nums1[candidate.nums1Index()] + nums2[candidate.nums2Index()])
        );
        int initialCandidateCount = Math.min(nums1.length, k);
        for (int i = 0; i < initialCandidateCount; i++) {
            minHeap.offer(new Candidate(i, 0));
        }

        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < k && !minHeap.isEmpty(); i++) {
            Candidate candidate = minHeap.poll();
            int nums1Index = candidate.nums1Index();
            int nums2Index = candidate.nums2Index();
            output.add(List.of(
                    nums1[nums1Index],
                    nums2[nums2Index]
            ));
            if (nums2Index + 1 < nums2.length) {
                minHeap.offer(new Candidate(nums1Index, nums2Index + 1));
            }
        }

        return output;
    }

    private record Candidate(int nums1Index, int nums2Index) {
    }
}
