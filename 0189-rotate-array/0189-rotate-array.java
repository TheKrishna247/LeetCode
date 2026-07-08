class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // k = 7 , n = 5 so k - n becomes -2 (invalid index)
        // Rotating by k = 7 in an array of length 5 is the same as rotating by k = 2.
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

    }
    private void reverse (int [] nums , int i , int j ){
            while(i<j){
                int temp = nums[i];
                nums [i] = nums[j];
                nums [j] = temp;

                i++;
                j--;
            }
        }
}