class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0 , j = 0;
        for(String ele: commands){
            if (ele.equals ("RIGHT"))j++;
            else if(ele.equals ("DOWN"))i++;
            else if(ele.equals ("LEFT"))j--;
            else if(ele.equals ("UP"))i--;
        }
        return (i*n)+j;
    }
}