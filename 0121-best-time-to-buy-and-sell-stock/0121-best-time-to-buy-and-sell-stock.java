class Solution {
    public int maxProfit(int[] prices) {
        int smallest = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length ; i++){
            if(smallest > prices[i]){
                smallest = prices[i];
            }
            ans = Math.max(ans , prices[i] - smallest);
        }
        return ans;
    }
}