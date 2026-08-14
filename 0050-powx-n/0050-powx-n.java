class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x,n);
    }
}

        // double pow = 1;
        // if (n==0) return pow;
        // if(n>0){
        //     for(int i = 0;i<n;i++)
        //         pow *=x;
        // }
        // else if(n<0){
        //     n= Math.abs(n);
        //     for(int i =0;i<n;i++)
        //         pow/=x;
        // }
        // return pow;