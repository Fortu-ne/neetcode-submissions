class Solution {
    public boolean hasDuplicate(int[] nums) {
        
           if(nums.length == 0) return false;

        HashSet<Integer> hash = new HashSet<>();

        for (int num : nums){

            if(hash.contains(num)){
                return  true;
            }else{
                hash.add(num);
            }

        }

        return false;

  
    }
}