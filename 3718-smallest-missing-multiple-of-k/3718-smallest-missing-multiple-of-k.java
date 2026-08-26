class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiple = k;
        while (true){
            boolean found = false;
            int i = 0;
            while(i<nums.length){
                if(nums[i++] == multiple){
                    found = true;
                    break;
                }
            }   
            if(!found) return multiple;
            multiple +=k;
        }
        
    }
}