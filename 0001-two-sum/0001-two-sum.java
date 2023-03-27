class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] answer = new int[2];
        int count = 0;
        while (true) {
            if (map.containsKey(target - nums[count])) {
                answer[0] = map.get(target - nums[count]);
                answer[1] = count;
                break;
            }
            map.put(nums[count], count);
            count++;
        }
        return answer;
    }
}