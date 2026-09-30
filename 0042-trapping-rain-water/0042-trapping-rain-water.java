class Solution {
    public int trap(int[] height) {
        int i = 0 , n = height.length , j = n-1;
        int left = 0;
        int right = 0;
        int sum =0 ;
        while(i<j){
            if(height[i]<=height[j]){
                if(height[i]>=left){
                    left = height[i];
                }
                else sum+= left-height[i];
                i++;
            }
            else{
                if(height[j]>=right){
                    right = height[j];
                }
                else sum+= right-height[j];
                j--;
            }
        }
        return sum;   
    }
}