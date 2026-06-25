class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxw =-1;
        int total =0;
        for(int weight:weights){
        maxw = Math.max(maxw,weight);
        total += weight; 
    }

    int left = maxw;
    int right = total;

    while(left<right){
        int mid = (left+right)/2;
        int dn =1;
        int currentw=0;
        for(int weight:weights){
            if(currentw + weight > mid){
                dn++;
                currentw =0;
            }
            currentw += weight;
        }

        if(dn > days){
            left = mid+1;
        }else {
            right = mid;
        }
    }
    return left;
}
}
