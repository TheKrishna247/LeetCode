class Solution {
    public String addSpaces(String s, int[] spaces) {
        char [] ans = new char[s.length() + spaces.length];
        int idx =0;
        int j = 0;
        for(int i = 0;i<s.length() ;i++){
            if (j<spaces.length && i ==spaces[j]){
                ans[idx++] = ' ';
                j++;
            }
            ans[idx++] = s.charAt(i);
        }
        return new String(ans);
    }
}
// StringBuilder t = new StringBuilder(s);
//         for(int i = spaces.length-1 ; i>= 0;i--){
//             t.insert(spaces[i]," ");
//         }
//         return t.toString();