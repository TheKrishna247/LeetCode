class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] freq = new int[128];
        for (char s : stones.toCharArray()) {
            freq[s]++;
        }
        int count = 0;
        for (char j : jewels.toCharArray()) {
            count += freq[j];
        }
        return count;
    }
}
