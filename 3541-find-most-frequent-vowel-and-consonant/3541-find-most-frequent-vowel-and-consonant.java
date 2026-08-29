class Solution {
    public int maxFreqSum(String s) {
        int n = s.length();
        char [] freq = new char[26];
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            int idx = ch-97;
            freq[idx]++;
        }
        int cnt1 = 0, cnt2 = 0 ;
        int max1 = 0 ,max2 = 0 ;
        for(int i =0 ;i <26;i++){
            char ch = (char)(i+97);
            if( ch == 'a' || ch == 'e'|| ch == 'o' || ch == 'i' || ch == 'u'){
                if(freq[i]>max1){
                    max1=freq[i];
                }
            }
            else if(!( ch == 'a' || ch == 'e'|| ch == 'o' || ch == 'i' || ch == 'u')){
                if(freq[i]>max2){
                    max2 = freq[i];
                }
            }
        }
        return max1+max2;
    }
}