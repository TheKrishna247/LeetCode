class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxp = Arrays.stream(piles).max().getAsInt();
        int low = 1, high = maxp;
        int ans = maxp;
        while(low<=high){
            int mid = low + (high-low)/2;
            long totalhr = calculatehours(piles, mid);
            if (totalhr <= h){
                ans = mid;
                high = mid-1;
            }
            else low = mid +1;
        }
        return ans;
    }
    public long calculatehours(int [] piles, int k){
        long totalhr = 0 ;
        for(int i : piles){
            totalhr += (long)(i + k - 1) / k;
        }
        return totalhr;
    }

}