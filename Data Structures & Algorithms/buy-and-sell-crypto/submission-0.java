class Solution {
    public int maxProfit(int[] prices) {
        int minSp = prices[0];
        int ans = 0;

        for(int i=0; i<prices.length; i++) {
            if(prices[i] < minSp) {
                minSp = prices[i];
            }
            ans = Math.max(ans, prices[i] - minSp);
        }

        return ans;
    }
}
