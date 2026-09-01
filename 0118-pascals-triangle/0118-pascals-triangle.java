class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>() ;
        for(int i = 1 ; i<=numRows ; i++){
            res.add(generaterows(i));
        }
        return res;
    }
    public List<Integer> generaterows(int row){
        long ans =1;
        List <Integer> nums = new ArrayList<>();
        nums.add(1); // nums.add(ans)
        for(int col = 1 ; col < row ;col++){
            ans = ans *(row-col);
            ans /= col;
            nums.add((int)ans);
        }
        return nums;
    }
}