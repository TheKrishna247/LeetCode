class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i = 0 ,cnt = 0, cnt1= 0; 
        int []ans = new int[nums.length];
        for(int j = 0;j<nums.length;j++){
            if (nums[j]<pivot) cnt++;
            if(nums[j]<=pivot) cnt1++;
        }
        // int k = cnt;
        // int m = cnt1;
        for(int j =0;j<nums.length;j++){
            if (nums[j]<pivot)  ans[i++] = nums[j];
            else if(nums[j]==pivot) ans[cnt++]=nums[j];
            else ans[cnt1++]= nums[j];
        }
        return ans;
    }
}