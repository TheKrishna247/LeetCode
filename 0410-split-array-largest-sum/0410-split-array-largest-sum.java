class Solution {
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = Arrays.stream(nums).sum();
        while(low<=high){
            int mid = (low+high)/2;
            int arrsum = countPartitions(nums,mid);
            if (arrsum>k) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
    public int countPartitions(int [] nums, int maxsum){
        int partitions =1;
        int arrsum = 0;

        for(int num : nums){
            if(arrsum + num <= maxsum)
                arrsum += num;
            else {
                partitions++;
                arrsum =num;
            }
        }return partitions;
    }
}