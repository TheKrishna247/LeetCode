class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = search(nums,target , true) ; 
        int last =  search(nums,target ,false) ; 

        return new int[] {first,last};
        
    }
    private int search(int [] nums , int target , boolean isfirst){
        int low = 0;
        int high = nums.length -1;
        int idx = -1;
        while(low<=high){
            int mid = low +(high -low)/2;

            if(nums [mid] < target)
                low = mid + 1;

            else if(nums[mid] > target)
                high = mid -1;
        
            else {// nums[mid] == target
                idx = mid ;
                if (isfirst)
                    high = mid -1 ;

                else
                    low = mid+1;
            }        
        } 
        return idx;
    }
}