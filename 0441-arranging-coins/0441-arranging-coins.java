class Solution {
    public int arrangeCoins(int n) {
        int count = 0 ;
        long sum = 0;
        for(int i = 1 ; sum+i <=n ;i++){
            sum +=i;
            if (sum<=n)
                count++;
            else return count;
        }
        return count ;
        
    }
}