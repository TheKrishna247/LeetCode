class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;

        int i = 0, j = 0;
        int m = s.length(), n = t.length();

        while (j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            if (i == m) {
                return true;
            }
            j++;
        }

        return false;
    }
}