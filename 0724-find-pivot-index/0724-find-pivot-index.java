class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int pivotLeftSum= 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if (sum - nums[0] == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            pivotLeftSum += nums[i];
            if (pivotLeftSum == (double)(sum - nums[i + 1]) / 2) {
                return i + 1;
            }
        }

        return -1;
    }
}