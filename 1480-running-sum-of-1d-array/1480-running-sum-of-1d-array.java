// class Solution {
//     public int[] runningSum(int[] nums) {
//         int [] ans = new int[nums.length];
//         for(int i =0;i<nums.length;i++){
//             ans[i] = summ(nums,i);
//         }
//         return ans;
//     }
//     public int summ(int []nums,int index){
//         int sum =0;
//         for(int i =0 ;i<=index;i++){
//             sum += nums[i];
//         }
//         return sum;
//     }
// }
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}