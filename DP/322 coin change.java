class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount +1]; //  make arr of 12 size 

        Arrays.fill(dp,amount+1); // every value of arr now 12

        dp[0] = 0; // only 1st value of arr 0

        for(int i =1; i <= amount; i++){

            for(  int coin:coins){
                 if(coin <= i){// selectefd coint ..1 < 11 yes  

                            dp[i] = Math.min(dp[i], dp[i-coin]+1);
                 }
            }
        }


            if(dp[amount] > amount ){   // 3 > 11 no so skip this
                return -1;
            }
        return dp[amount]; // return 3
    }
}
