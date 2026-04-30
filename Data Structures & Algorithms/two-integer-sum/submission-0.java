class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> hash = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            
            int values = target - nums[i];
            if(hash.containsKey(values))
            {
                return new int[] { hash.get(values), i};
            }
            else{
                hash.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}
