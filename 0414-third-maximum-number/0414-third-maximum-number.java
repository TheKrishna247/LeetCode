class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE , max2 = Long.MIN_VALUE ,max3 = Long.MIN_VALUE;
        for(int ele:nums){
            if (ele == max1 || ele == max2 || ele == max3) continue;
            if(max1 == Long.MIN_VALUE || ele>max1){
                max3 = max2;
                max2 = max1;
                max1 =ele;
            }
            else if(max2== Long.MIN_VALUE || ele>max2){
                max3=max2;
                max2=ele;
            }
            else if(max3==Long.MIN_VALUE || ele>max3){
                max3 = ele;
            }
        }
        return max3==Long.MIN_VALUE?(int) max1:(int)max3;
    }
}