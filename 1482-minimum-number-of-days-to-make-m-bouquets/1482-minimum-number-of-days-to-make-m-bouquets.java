class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m*k;
        if(val > bloomDay.length) return -1; // impossible case 

        int low =Arrays.stream(bloomDay).min().getAsInt();
        int high =Arrays.stream(bloomDay).max().getAsInt();
        int ans =-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(possible(bloomDay,mid,m,k)== 1){
                ans =mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
    }
    public int possible(int[] nums,int day ,int m , int k  ){
        int count = 0;
        int numofbou = 0;
        for(int i =0;i<nums.length;i++){
            if (nums[i] <=day)
                count++;
            else {
                numofbou += count/k;
                count = 0 ;
            }
        }
        numofbou += count/k;
        if (numofbou >=m) return 1;
        return -1;
    }
}