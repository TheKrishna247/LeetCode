class Solution {
    public int[] shuffle(int[] nums, int n) {
        int index =0;
        int [] arr = new int[nums.length];
        for(int i = 0;i<nums.length/2;i++){
            arr[index++]=nums[i];
            arr[index++]=nums[i+n];

        }
        return arr;
    }
}