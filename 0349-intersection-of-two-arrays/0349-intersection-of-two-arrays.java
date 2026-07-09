class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> arr = new ArrayList<>();
        int i = 0 , j = 0 ;
        while(i<nums1.length && j <nums2.length){
            if(nums1[i]<nums2[j]) i++;
            else if(nums2[j]<nums1[i]) j++;
            else{
                if(arr.isEmpty() || arr.get(arr.size()-1 ) != nums1[i])
                    arr.add(nums1[i]);
                i++ ; 
                j++;
            }    
        }
        int [] result = new int[arr.size()];
        for (int k = 0; k <arr.size();k++ ) 
            result[k] = arr.get(k);
        return result;
        
    }
}