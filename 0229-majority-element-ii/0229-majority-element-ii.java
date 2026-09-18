class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt = 0 ,cnt1 =0 , n = nums.length;
        int el1 = Integer.MIN_VALUE , el2 = Integer.MIN_VALUE;
        for(int i = 0;i<n ;i++){
            if(cnt == 0 && el2 != nums[i] ){
                cnt=1;
                el1 = nums[i];
            }
            else if (cnt1 ==0 && el1 != nums[i]){
                cnt1=1;
                el2=nums[i];
            }
            else if(el1== nums[i]) cnt++;
            else if(el2 == nums[i]) cnt1++;
            else{
                cnt--;
                cnt1--;
            }
        }
        List<Integer> arr = new ArrayList<>();
        int count1 = 0, count2 =0;
        for(int i =0;i<n ;i++){
            if(el1 == nums[i]) count1++;
            if(el2 == nums[i])count2++;
        }
        if(count1 > n/3) arr.add(el1);
        if(count2 > n/3) arr.add(el2);
        return arr;
    }
}