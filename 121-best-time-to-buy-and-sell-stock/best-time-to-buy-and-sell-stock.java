class Solution {
    public int maxProfit(int[] prices) {
        int small = prices[0];
        int large = prices[0];
        int ans = 0;

        for (int i = 1; i < prices.length; i++) {
            if(prices[i]<small){
                small=prices[i];
                large = 0;
            }
            if(prices[i]>large){
                large = prices[i];
            }
            if(large - small > ans){
                ans = large - small;
            }
        }
        if(large - small > ans){
            ans = large - small;
        }
        return ans;
    }
}
