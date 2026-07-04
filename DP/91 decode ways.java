class Solution {
    public int numDecodings(String s) {

          int n = s.length();

          int[] dp = new int[n+1];

          dp[n] = 1; // empty string already valid decode value

          for(int i =n-1; i >= 0; i--){ // right to left check
                    if(s.charAt(i) == '0'){ // check index wise number ..itis zero or not ex. ind=2 ..num=6 not= 0 go 
                        dp[i] = 0;
                        continue;

                    }

                    dp[i] = dp[i+1]; // i=1 so take 2 what remain is 6 . how many ways to decode 6 is dp[3] =1 so dp[2] = dp[3] ....dp[2] = dp[2+1] =3 

                    if(i+ 1< n){ // i=1, i+1 =2 < 3 (n=3) yes so next step go

                        int num = (s.charAt(i)- '0') * 10   + // i=1 so value is 2 *10 = 20 +
                                  (s.charAt(i+1) -'0')  ;    // i+1 =2 so value at i=2 is 6 so 20+6 =26 .



                                  if(num >= 10 && num <= 26){
                                    dp[i] += dp[i+2];
                                  }



                    }


          }  
          return dp[0];
          
    }
}
