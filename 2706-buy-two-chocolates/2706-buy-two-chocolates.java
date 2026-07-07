class Solution {
    public int buyChoco(int[] prices, int money) {
    
    int min = 99999;
    int sec = 99999;
    for (int i =0;i<prices.length;i++){
        if (prices[i]<min){
            sec = min;
            min = prices[i];
        }
        else if(prices[i]<sec )
        {
            sec=prices[i];
        }
    }

    int leftover = money -(min +sec);

    if (leftover>=0){
        return leftover;
    }
    return money;
    
    
    }
}