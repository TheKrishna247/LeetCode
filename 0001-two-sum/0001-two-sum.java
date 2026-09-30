class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int res = target -nums[i];
            if(mpp.containsKey(res)){
                return new int[]{mpp.get(res),i};
            }
            mpp.put(nums[i],i);
        }
        return new int []{,};
    }
}