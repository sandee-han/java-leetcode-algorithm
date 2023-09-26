class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numberOccurrence = new HashMap<>();
        Set<Integer> valueSet = new HashSet<>();

        for (int i : arr) {
            if (!numberOccurrence.containsKey(i)) {
                numberOccurrence.put(i, 1);
            } else {
                numberOccurrence.put(i, numberOccurrence.get(i) + 1);
            }
        }

        for (Integer integer : numberOccurrence.keySet()) {
            valueSet.add(numberOccurrence.get(integer));
        }

        if (valueSet.size() != numberOccurrence.size()) return false;

        return true;
    }
}