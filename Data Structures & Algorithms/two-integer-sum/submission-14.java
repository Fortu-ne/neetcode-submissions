class Solution {
    public int[] twoSum(int[] nums, int target) {

         if(nums == null) return new int[]{};


        HashMap<Integer,Integer> hash = new HashMap<>();

    

        for (int i = 0; i < nums.length; i++) {
            
            int res = target - nums[i];
            
            if(hash.containsKey(res)){
                return new int[]{hash.get(res).intValue(),i};
            }
            else{
                 hash.put(nums[i],i);
            }
        }
        
        
        return new int[]{};

    }
}
