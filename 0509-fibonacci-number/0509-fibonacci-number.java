class Solution {
    public int fib(int n) {
        int first = 0 , second = 1 , next =0;
        if (n<=1) return n;
        for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return next;
    }
}