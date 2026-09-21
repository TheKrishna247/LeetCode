class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int curr =1;
        for(int i = 0;i<n;i++){
            curr *= nums[i];
            max = Math.max(curr,max);
            if(curr == 0) curr =1;
        }
        curr =1;
        for(int i = n-1;i>=0;i--){
            curr *= nums[i];
            max = Math.max(curr,max);
            if(curr == 0) curr=1;
        }
        return max;
    }
}