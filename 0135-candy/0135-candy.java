class Solution {
    public int candy(int[] nums) {
        int n = nums.length;
        int []ans = new int[n];
        Arrays.fill(ans, 1);

        for(int i = 1;i<n;i++){
            if(nums[i-1]< nums[i]) ans [i] = ans [i-1]+1;
        }
        for(int i = n-2 ; i>=0;i--){
            if(nums[i+1]<nums[i]) ans[i] = Math.max(ans[i],ans[i+1]+1);
        }
        int res = 0;
        for(int x : ans) res += x;
        return res;
    }
}