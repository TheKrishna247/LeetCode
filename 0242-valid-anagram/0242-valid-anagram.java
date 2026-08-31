class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;

        int [] freq = new int [26];
        for (int i =0 ;i<s.length();i++){
            freq[s.charAt(i) - 97]++;
            freq[t.charAt(i) - 97]--;
        }
        for(int count : freq){
            if(count!= 0) return false;
        }
        return true;
        // char [] arr1 = s.toCharArray();
        // char [] arr2 = t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // int i = 0;
        // while(i<arr1.length){
        //     if(arr1[i] != arr2[i]) return false;
        //     i++;
        // }
        // return true;
    }
}