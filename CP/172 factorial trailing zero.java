class Solution {
    public int trailingZeroes(int n) {
        
        int trail_zero = 0;

         while(n > 0){
            n = n /5;
            trail_zero = trail_zero + n;
         }

         return trail_zero;
    }
}
