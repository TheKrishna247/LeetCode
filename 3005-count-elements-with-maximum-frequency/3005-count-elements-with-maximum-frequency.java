class Solution {
    public int maxFrequencyElements(int[] nums) {
        int [] freq = new int[101];

        for(int i =0;i<nums.length;i++){
            int idx=nums[i];
            freq[idx]++;
        }
        int maxfreq = 0;
        int cnt = 0;
        
        for(int i = 0 ;i<freq.length;i++){
            if (freq[i]> maxfreq){
                maxfreq= freq[i];
                cnt = freq[i];
            }
            else if(freq[i] == maxfreq){
                cnt+=freq[i];
            }
        }
        return cnt;
    }
}