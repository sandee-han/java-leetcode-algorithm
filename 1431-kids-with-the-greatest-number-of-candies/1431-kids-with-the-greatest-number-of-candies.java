class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answerList = new ArrayList<>();

        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        int checkCandies = maxCandies - extraCandies;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] < checkCandies) {
                answerList.add(false);
            } else {
                answerList.add(true);
            }
        }
        return answerList;
    }
}