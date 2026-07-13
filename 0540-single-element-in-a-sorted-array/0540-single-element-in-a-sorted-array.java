class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        else if (nums[0] != nums[1]) return nums[0];
        else if (nums[n-2] != nums[n-1]) return nums[n-1];
        int low = 0 , high = n-1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1])
                return nums[mid];
            int fo = mid , so = mid;
            if (nums[mid -1] == nums[mid])
                fo = mid-1;
            else // (nums[mid] == nums[mid+1])
                so = mid+1;
            
            int leftcnt= fo-low , rightcnt = high - so;
            if (leftcnt % 2 == 0) low = so + 1;
            else // rightcnt %@ ==0
                high = fo -1;
        }   
        return -1;
    }
}