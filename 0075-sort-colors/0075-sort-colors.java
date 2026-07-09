class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int mid = 0, low = 0 , high = n-1;

        while(mid<=high){
            if (nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1)  mid++;
            else{
                swap(nums,mid,high);
                high--;
            }
        }   
    }
    private void swap(int[] nums,int i , int j){
        int temp = nums[i] ;
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

//     int c0=0,c1=0,c2 =0;
//     for(int i =0;i<nums.length;i++){
//         if (nums[i]==0) c0++;
//         if(nums[i]==1) c1++;
//         if(nums[i]==2) c2++; 
//     }
//     for(int i =0 ;i<c0;i++) nums[i]=0;
//     for(int i =c0 ;i<c0+c1;i++) nums[i]=1;
//     for(int i =c1+c0 ;i<c2+c0+c1;i++) nums[i]=2;