class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while(low<=high){
            int mid = (high+low)/2;
            if(numofdays(weights,mid) <= days){
                high = mid-1;
            }
            else low = mid+1;
        }
        return low;
    }
    public int numofdays(int [] weights , int cap ){
        int load = 0 , days =1;
        for(int i = 0;i<=weights.length-1;i++){
            if(load+weights[i]>cap){
                days++;
                load = weights[i];
            }
            else load += weights[i];
        }
        return days;
    }
}