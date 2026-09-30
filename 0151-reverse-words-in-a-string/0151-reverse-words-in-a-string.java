class Solution {
    public String reverseWords(String s) {
        // s = s.trim();
        List <String> ans = new ArrayList<String>();
        StringBuilder word = new StringBuilder ();

        for(int i = 0; i<s.length(); i++){
            if (s.charAt(i) != ' ') word.append(s.charAt(i));

            else if( word.length() > 0){
                ans.add(word.toString());
                word.setLength(0);
            }
        }
        if(word.length() > 0){
            ans.add(word.toString());
        }
        Collections.reverse(ans);
        return String.join(" ", ans); 

    }
}