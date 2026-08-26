class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int [] freq= new int [26];
        for(int i = 0;i<n ;i++){
            char ch = s.charAt(i);
            int idx = ch -97;
            freq[idx]++;
        }
        char ch = s.charAt(0);
        for(int i =0;i<n;i++){
            if(freq[s.charAt(i) - 97] == 1 ){
                return i;
            }
        }
        return -1;
    }
}