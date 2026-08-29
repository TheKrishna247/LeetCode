class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0, j = s.length()-1;
        char [] ch = new char [s.length()];

        for (int m =0 ; m< s.length() ;m++)  
            ch[m] = s.charAt(m);

        while(i<j){

            if  ((ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')&&(ch[j]>='a' && ch[j]<='z' || ch[j]>='A' && ch[j]<='Z' ) ){
                char temp = ch[i];
                ch[i] = ch[j];
                ch [j] = temp ;
                i++;
                j--;
            }

            else if (!(ch[j]>='a' && ch[j]<='z' || ch[j]>='A' && ch[j]<='Z' )) 
                j--;
                
            else i++;
        }
        return new String(ch);
    }
}