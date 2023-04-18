class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> answer = new ArrayList<>();
    Arrays.sort(nums);
    int base = 0;

    while (base < nums.length - 2) {
			
        int left = base + 1;
        int right = nums.length - 1;

        while (left < right) {
            int check =  nums[base] + nums[left] + nums[right];
            if (check == 0) {
                List<Integer> innerAnswer = new ArrayList<>();
                innerAnswer.add(nums[base]);
                innerAnswer.add(nums[left]);
                innerAnswer.add(nums[right]);
                answer.add(innerAnswer);
                while (nums[left] == nums[left + 1] && left + 1 < right) {
                    left++;
                }
                left++;
            } else if (check < 0) {
                left++;
            } else {
                right--;
            }
        }

        while (nums[base] == nums[base + 1] && base + 1 < nums.length - 2) {
            base ++;
        }
        base++;
    }
    return answer;
    }
}