class Solution {
    public boolean halvesAreAlike(String s) {
        int cnt = 0;
        int n = s.length();

        for(int i = 0 ; i<n/2;i++){
            if(isvowel (s.charAt(i))) cnt++;
            if(isvowel (s.charAt(n/2 + i ))) cnt -- ;
        }
        return cnt == 0;
    }
    public boolean isvowel(char c){
        if ("aeiouAEIOU".indexOf(c) != -1)
            return true;
        return false;
    }
}