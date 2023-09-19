class Solution {
    public void moveZeroes(int[] nums) {
        int frontPointer = 0;
        int endPointer = 1;
        int temp;

        if (nums.length == 1) {
            return;
        }

        while (endPointer < nums.length) {
            if (nums[frontPointer] == 0 && nums[endPointer] != 0) {
                temp = nums[frontPointer];
                nums[frontPointer] = nums[endPointer];
                nums[endPointer] = temp;
                frontPointer++;
                endPointer++;
            } else if (nums[frontPointer] == 0 && nums[endPointer] == 0){
                endPointer++;
            } else {
                frontPointer++;
                endPointer++;
            }
        }

        return;
    }
}