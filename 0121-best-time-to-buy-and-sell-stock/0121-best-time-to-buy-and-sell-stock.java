class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int p : prices){
            buy = Math.min(buy , p);
            profit = Math.max(profit , p - buy);
        } 
        return profit;
    }
}