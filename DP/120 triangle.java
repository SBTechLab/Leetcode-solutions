class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n = triangle.size();

        // start second last row
        for(int i = n-2; i>= 0; i--){
            
            // traverse current row
            for(int j =0; j <= i; j++){

                triangle.get(i).set // replace with new value
                ( j,   
                     
                     triangle.get(i).get(j) // last 2nd row fetch
                        + Math.min 
                            ( 
                                triangle.get(i+1).get(j), //last row 1st value
                                triangle.get(i+1).get(j+1)// last row 2nd value
                            )
                );


            }
        }

        return triangle.get(0).get(0);
    }
}
