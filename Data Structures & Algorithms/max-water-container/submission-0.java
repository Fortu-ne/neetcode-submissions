class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heights.length -1;
        int best =0;

        while(l < r){
            int h = Math.min(heights[l], heights[r]);
            best = Math.max(best, h * (r-l));
            if (heights[l] < heights[r]) l++;   // move the shorter side
        else r--;
        }

        return best;
    }
}
