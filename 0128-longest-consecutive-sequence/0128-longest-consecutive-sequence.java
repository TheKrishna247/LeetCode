class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length == 0) return 0; 
        Arrays.sort(nums);

        int lastsmall = Integer.MIN_VALUE;
        int longest =1;
        int count = 0;

        for(int i =0 ; i<nums.length;i++){
            if(nums[i]-1==lastsmall){
                count++;
                lastsmall = nums[i];
            }
            else if(nums[i]!=lastsmall){
                count =1;
                lastsmall = nums[i];
            }
            
            // else if (nums[i] == lastsmall) // do nothing 
            
            longest = Math.max(longest,count);
        }
        return longest;
        
    }
}