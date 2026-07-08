class Solution {
    public boolean check(int[] nums) {
        int n = nums.length , culprit =0;
        for (int i = 1; i<n ;i++)
            if (nums[i]<nums[i-1]) culprit++;
        
        if (nums[0]<nums[n-1]) culprit++;

        return culprit <= 1;
        
    }
}