package leetcode.problems._3635_earliest_finish_time_for_land_and_water_rides_ii;

class Solution {
    public int earliestFinishTime(
            int[] landStartTime,
            int[] landDuration,
            int[] waterStartTime,
            int[] waterDuration
    ) {
        return Math.min(
                minFinishTime(landStartTime, landDuration, waterStartTime, waterDuration),
                minFinishTime(waterStartTime, waterDuration, landStartTime, landDuration)
        );
    }

    private int minFinishTime(
            int[] firstStartTime,
            int[] firstDuration,
            int[] secondStartTime,
            int[] secondDuration
    ) {
        int firstMinEndTime = Integer.MAX_VALUE;
        for (int i = 0; i < firstStartTime.length; i++) {
            firstMinEndTime = Math.min(firstMinEndTime, firstStartTime[i] + firstDuration[i]);
        }

        int minFinishTime = Integer.MAX_VALUE;
        for (int i = 0; i < secondStartTime.length; i++) {
            int finishTime = Math.max(firstMinEndTime, secondStartTime[i]) + secondDuration[i];
            minFinishTime = Math.min(minFinishTime, finishTime);
        }

        return minFinishTime;
    }
}
