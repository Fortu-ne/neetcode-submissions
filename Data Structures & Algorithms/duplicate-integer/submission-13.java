class Solution {
    public boolean hasDuplicate(int[] nums) {

        // 1, 2 , 3 , 3
        // 0, 1 , 3 , 4

        if(nums.length < 1) return false;
        

        // for(int i = 1; i < nums.length; i++){
            
        //     if(nums[i] == nums[i -1]){
        //         return true;
        //     }
        // }

        HashSet<Integer> hash = new HashSet<>();


        for(int n : nums){
            if(hash.contains(n)){
                return true;
            }
            else{
                hash.add(n);
            }
        }

         return false;

    }
}