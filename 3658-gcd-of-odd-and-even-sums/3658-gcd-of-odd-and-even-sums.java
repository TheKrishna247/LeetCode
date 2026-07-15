class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evensum = n*(n+1);
        int oddsum = n*n;

        while(oddsum > 0 && evensum > 0){
            if(oddsum>evensum) oddsum = oddsum % evensum ;
            else evensum = evensum % oddsum ;
        }
        if (oddsum == 0)  return evensum ;
        return oddsum;
        
    }
}