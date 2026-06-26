class Solution {
    public int splitArray(int[] nums, int k) {
        
        int left =0;
        int right =0;

        for(int num:nums){
            left = Math.max(left,num);
            right = right + num;
        }

        while(left<right){
            int mid = left+(right-left)/2;

            int pieces =1;
            int currSum =0;

            for(int num: nums){
                if(currSum + num >mid){
                    pieces++;
                    currSum =0;
                }
                currSum += num;
            }

            if(pieces > k){
                left = mid +1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}
