class Solution {
    public int sumOfSquares(int[] nums) {
        long sum = 0 , n = nums.length;
        for(int i = 1;i<=nums.length;i++){
            if( n%i == 0) sum+=nums[i-1]*nums[i-1];
        }
        return (int)sum;
    }
}