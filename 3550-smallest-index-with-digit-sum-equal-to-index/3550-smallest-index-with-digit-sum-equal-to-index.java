class Solution {
    public int smallestIndex(int[] nums) {
        int sum ;
        for(int i =0 ;i<nums.length;i++){
            sum = 0;
            int n = nums[i];
            if(nums[i]<9 && nums[i]!=i) continue;
            while(n>0){
                int digit =n%10;
                sum+=digit;
                n/=10;
            }
            if (sum== i ) return i;
        }
        return -1;
    }
}