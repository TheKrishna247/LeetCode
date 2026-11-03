class Solution {
    public int minMoves(int[] nums) {
        int max = -1, sum =0;
        for(int ele: nums){
            if(ele>max) max = ele;
            sum += ele;
        }
        return max*nums.length - sum;
    }
}