class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        char [] ch = new char[s.length()];
        int j =0;
        for(int i = 0; i<s.length() ;i++){
            char c = s.charAt(i);
            if(c == '(') ch[j++] = ')';
            else if(c == '[') ch[j++] = ']';
            else if(c == '{') ch[j++] = '}';
            else{
                if(j ==0 || ch[--j] != c) return false;
            }
        }
        return j==0;
    }
}