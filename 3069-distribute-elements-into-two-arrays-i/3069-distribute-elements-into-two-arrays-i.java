class Solution {
    public int[] resultArray(int[] nums) {
        
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int i = 2;
        while(i<nums.length) {
            if (arr1.get(arr1.size()-1) >arr2.get(arr2.size()-1))
                arr1.add(nums[i++]);
            else arr2.add(nums[i++]);
        }
        int [] ans = new int [nums.length];
        for (int j=0;j<arr1.size();j++){
            ans[j] = arr1.get(j);
        }
        int a = arr1.size();
        for(int j = 0;j<arr2.size();j++){
            ans[a+j] = arr2.get(j);
        }  
        return ans;
    }
}