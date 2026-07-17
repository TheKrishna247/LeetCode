class Solution {
    public int findKthPositive(int[] arr, int k) {
        int [] nums = new int [k +arr.length];
        for (int a = 0 ; a < nums.length ; a++)
            nums[a] = a+1;
        int i = 0 ;
        int j = 0;
        List<Integer> c = new ArrayList<>();
        while (j<nums.length){
            if (i < arr.length && arr[i] == nums[j]){
                i++;
                j++;
            } 
            else{ // arr[i] != nums[j]
                c.add(nums[j]);
                j++;
            }
        } 
        return c.get(k-1);
    }
}