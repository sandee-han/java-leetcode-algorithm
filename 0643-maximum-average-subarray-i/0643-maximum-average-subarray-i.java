class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0;
        for (int i = 0; i < nums.length - k + 1; i++) {
            int total = 0;
            for (int j = i; j < k + i; j++) {
                total += nums[j];
            }
            double avg = (double)total / (double)k;
            if (avg > maxAvg || i == 0) {
                maxAvg = avg;
            }

        }

        return maxAvg;
    }
}