class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int moves = 0;
        for(int ele: nums){
            moves += ele;
            min = Math.min(min,ele); 
        }
        return moves - (nums.length*min);
    }
}