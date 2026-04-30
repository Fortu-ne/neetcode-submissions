class Solution {
    public int maxProduct(int[] nums) {
          if(nums.length < 1) return 0;

        int currMin = nums[0];
        int currMax = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
           int tempMax = Math.max(n,Math.max(currMin * n, currMax * n));
           currMin = Math.min(n,Math.min(currMin * n, currMax * n));
           currMax = tempMax;
           res = Math.max(res,currMax);
        
        }
        
        return res;
    }
}
