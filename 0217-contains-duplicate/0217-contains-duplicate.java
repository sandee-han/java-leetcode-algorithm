class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
						// 중간에 탈출할 수 있게 비교
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}