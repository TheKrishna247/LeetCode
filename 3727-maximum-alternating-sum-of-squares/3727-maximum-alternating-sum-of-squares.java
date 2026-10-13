class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int str = 0 , end = n-1;
        long sum = 0;
        for(int i = 0;i<n;i++){
            if (i % 2 == 0) {
                // val = nums[end--];
                sum += (long) nums[end] * nums[end];
                end--;
            } else {
                // val = nums[str++];
                sum -= (long) nums[str] * nums[str];
                str++;
            }
        }
        return sum;
    }
}