class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                ans[count] = nums[i];
                count++;
            }
        }
        if (count <= 1) return nums;
        k = k % count;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                nums[i] = ans[(j + k) % count];
                j++;
            }
        }

        return nums;
    }
}