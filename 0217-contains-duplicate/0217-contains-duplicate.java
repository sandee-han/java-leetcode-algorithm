class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> madeSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            madeSet.add(nums[i]);
        }
        if (nums.length == madeSet.size()) {
            return false;
        }
        return true;
    }
}