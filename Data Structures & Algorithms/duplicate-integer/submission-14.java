class Solution {
    public boolean hasDuplicate(int[] nums) {

        // 1, 2 , 3 , 3
        // 0, 1 , 3 , 4

        Arrays.sort(nums);

        if(nums.length < 1) return false;

        int temp = nums[0];
        

        for(int i = 1; i < nums.length; i++){
            
            if(nums[i] == temp){
                return true;
            }
            temp = nums[i];
        }

      

         return false;

    }
}