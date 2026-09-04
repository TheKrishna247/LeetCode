class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int i = 0;
        int ans = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            i = Math.max(i , freq[c]);
            ans = Math.max(ans, j - i + 1);
            freq[c] = j + 1;
        }
        return ans;
    }
}