class Solution {
    public boolean checkString(String s) {
        boolean flag = true;
        int cnt =0 ;
        for(char ele : s.toCharArray()){
            if(ele == 'b')cnt++;
            else if(ele == 'a'&& cnt>=1) flag = false;
        }
        return flag;
    }
}