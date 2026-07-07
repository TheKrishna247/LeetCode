class Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x!=0){
            rev = rev *10 + x %10;
            x /= 10;
        }
        if ( rev >=Integer.MIN_VALUE && rev <= Integer.MAX_VALUE)
            return (int) rev;
        return 0;
    }
}

    //     int rev = 0 ; 
    //     int digit= 0 ;
    //     int a = Math.abs(x);
    //     while(a>0){
    //         digit = a %10;
    //         if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
    //             return 0; // overflow case  >>>>   2147483647
    //         }
    //         rev = rev *10 + digit;
    //         a /=10; 
    //     }
    //     if (x>0)return rev ;
    //     else return -rev;