public class BuyandSellStock {
    public static void main(String[] args) {
        int arr[] = {2,1,2,0,1};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices) {
        int profit =0;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<prices.length;i++){
            if(smallest > prices[i]){
                smallest = prices[i];
            }
            int min = prices[i] - smallest;
            if(profit < min){
                profit = min;
            }
        }
        return profit;
    }
}
