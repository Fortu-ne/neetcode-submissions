class Solution {
    public int maxArea(int[] heights) {
        
     if(heights.length < 1) return 0;


        int l = 0;
        int r = heights.length - 1;
        int best =0;

        while(l < r){

            
                int h = r - l;
                best = Math.max(best, h * (Math.min(heights[r],heights[l])));
                
            if(heights[l] < heights[r]){
                l+=1;

            }
            else{
                r-=1;
            }


        }

        return best;

    }
}
