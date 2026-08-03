class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1 ; i<=mountain.length-2 ;i++){
            if(mountain[i]> mountain[i-1] && mountain[i]>mountain[i+1]){
                ans.add(i);
                i++;
            }
        }
        return ans;
    }
}