class Solution {
    public int numSquares(int n) {
        
        int[] dp = new int[n+1];


        Arrays.fill(dp,n+1);

        dp[0] = 0;

        for(int i = 1; i <=n; i++){    // start i 1 to 12
             for (int j =1;  j * j <= i; j++){  // see how many perfect square come untill i means untill 12
                
                 int square = j*j;  // that ^2 store in square 

                 dp[i] = Math.min(dp[i],dp[i - square]+1);  // check minimum value
             }
        }

        return dp[n];  // for dp 0 to 12 check for 12 ans is 3 
    }
}
