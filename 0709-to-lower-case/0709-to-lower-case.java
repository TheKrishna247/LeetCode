class Solution {
    public String toLowerCase(String s) {
        String t = "";
        for(int i = 0 ;i<s.length(); i++){
            char c = s.charAt(i);
            if (s.charAt(i) >= 'A' && s.charAt(i) <='Z'){
               c = (char) (c + 32);
            }
            t += c;
        }
        return t;
    }
}