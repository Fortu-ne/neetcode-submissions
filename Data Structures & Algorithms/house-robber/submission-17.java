class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];

        if(nums.length < 1) return 0;
        if(nums.length == 1) return nums[0];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[0]);

        for(int n = 2; n< nums.length; n++){
            dp[n] = Math.max(nums[n] + dp[n -2], dp[n -1 ]);
        }


        return dp[nums.length -1];
    }
}
