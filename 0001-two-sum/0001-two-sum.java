class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int[] answer = new int[2];
        int count = 0;

        while (answer[1] == 0) {
            if (map.containsKey(target - nums[count]) && count != map.get(target - nums[count])) {
                answer[0] = count;
                answer[1] = map.get(target - nums[count]);
                break;
            }
            count++;
        }

        return answer;
    }
}