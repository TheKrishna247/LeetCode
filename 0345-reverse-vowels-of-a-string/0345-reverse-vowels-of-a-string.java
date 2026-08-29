class Solution {
    public String reverseVowels(String s) {
        char [] ans = s.toCharArray();
        int i =0, j = s.length()-1;
        String vowel = "aeiouAEIOU";
        while(i<j){
            if (!(vowel.indexOf(ans[i]) !=-1) ) i++;
            else if (!(vowel.indexOf(ans[j]) !=-1) ) j--;
            else {
                char temp = ans[i];
                ans[i] = ans[j];
                ans[j] = temp ;
                i++;
                j--;
            }
        }
        return new String(ans);
    }
}