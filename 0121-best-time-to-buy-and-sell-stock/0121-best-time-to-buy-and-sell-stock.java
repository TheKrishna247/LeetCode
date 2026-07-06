class Solution {
    public int maxProfit(int[] prices) {
        int min= 99999;
        int max =0;
        for(int i=0;i<prices.length;i++){
            min = Math.min(prices[i],min);
            int current = prices[i]-min;
            max = Math.max(current,max);

        }
        return max;
    }

}