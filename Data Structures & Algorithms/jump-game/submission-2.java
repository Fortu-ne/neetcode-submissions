class Solution {
    public boolean canJump(int[] nums) {

    if(nums.length < 1) return false;

    int reach = 0;

    for(int n = 0; n < nums.length; n++){

     if(n > reach) return false;

     reach = Math.max(reach, nums[n] + n);

    }
        
        return true;
    }
}
