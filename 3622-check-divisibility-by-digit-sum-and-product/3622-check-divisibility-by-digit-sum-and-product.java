class Solution {
    public boolean checkDivisibility(int n) {
        int ssum=0 , psum =1, sum = 0;
        int original = n;
        while(n>0){
            int digit = n%10;
            ssum += digit;
            psum *= digit;
            n /= 10; 
        }
        sum = ssum + psum;
        return original % sum == 0; 
    }
}