public class buysellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxprofit = Integer.MIN_VALUE;
        for(int i = 0; i < prices.length; i++){
            min = Math.min(min, prices[i]);

            maxprofit = Math.max(maxprofit,(prices[i]-min));
        }
        return maxprofit;
    }
}
