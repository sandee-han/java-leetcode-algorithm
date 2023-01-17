class Solution {
    public int maxProfit(int[] prices) {
        int L = 0;
        int R = 1;
        int maxValue = 0;

        while (R < prices.length) {
            if (prices[R] > prices[L]) {
                maxValue = Math.max(maxValue, prices[R] - prices[L]);
            } else {
                L = R;
            }
            R++;
        }
        return maxValue;
    }
}