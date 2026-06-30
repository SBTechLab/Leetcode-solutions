class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b)-> a[1]-b[1]);//sort by last number of pair
        int count = 0;

        int prevEnd = intervals[0][1]; //lst number of pair stored

        for(int i =1; i < intervals.length; i++){
            if(intervals[i][0] < prevEnd){
                count++;
            }else{
                prevEnd = intervals[i][1]; // new pair last number store so update...

            }
        }

        return count;
    }
}
