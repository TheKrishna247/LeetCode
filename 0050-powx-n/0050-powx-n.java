class Solution {
    public double myPow(double x, int n) {
        // return Math.pow(x,n);
        if (n==0) return 1.0;
        if (x == 0) return 0.0;
        long N = n ;
        if (n<0){
            x = 1/x;
            N = -N;
        }
        double res = 1.0;
        double current = x ;

        while(N>0){
            if(N%2==1){
                res = res*current;
            }
            current *=current;
            N/=2;
        }
        return res;
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