class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        if(nums.length < 1) return false;

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