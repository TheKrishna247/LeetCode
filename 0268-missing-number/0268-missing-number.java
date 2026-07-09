class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        int n = nums.length;
        for(int i=0;i <n;i++){
            xor2 = xor2^nums[i];
            xor1= xor1^(i+1);
        }
        xor1= xor1^0;
        return xor1^xor2;
    }
}

    // int sum = 0;
    // int esum = 0;
    // int n= nums.length;
    // for (int i =0 ;i<n;i++)  esum = esum+nums[i];
    // sum = n*(n+1)/2;
    // return sum - esum;