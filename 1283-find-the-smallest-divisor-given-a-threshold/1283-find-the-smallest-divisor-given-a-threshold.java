class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int ans= 0;
        int low = 1 , high = Arrays.stream(nums).max().getAsInt();
        while(low<=high){
            int mid = low+(high-low)/2;
            if(sumofdiv(nums,mid) <= threshold){
                ans = mid;
                high = mid-1;
            }
            else low =mid+1;
        }
        return low; // or return ans 
    }
    public int sumofdiv(int [] nums, int divisor){
        int sum = 0; 
        int n = nums.length;
        for(int i :nums){
            sum = sum + (int) Math.ceil((double)i/divisor);
        }
        return sum;
    }
}