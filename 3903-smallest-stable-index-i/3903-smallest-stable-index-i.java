class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int j =0;j<nums.length;j++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i <= j; i++) 
                max = Math.max(max, nums[i]);

            for (int i = j; i < nums.length; i++) 
                min = Math.min(min, nums[i]);

            if(max-min <= k)return j;

        }
        return -1;
    }   
}