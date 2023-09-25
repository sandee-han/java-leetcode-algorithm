class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());

        for (int i : nums1) {
            nums1Set.add(i);
        }

        for (int i : nums2) {
            nums2Set.add(i);
        }

        for (int i : nums1Set) {
            if(!nums2Set.contains(i)) {
                answer.get(0).add(i);
            }
        }

        for (int i : nums2Set) {
            if(!nums1Set.contains(i)) {
                answer.get(1).add(i);
            }
        }

        return answer;
    }
}