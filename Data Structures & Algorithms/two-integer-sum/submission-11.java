class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        if(nums.length == 0) return null;

        HashMap<Integer,Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int result = target - nums[i];

            if(hash.containsKey(result)){

                return new int[] {hash.get(result),i};

            }else{
                hash.put(nums[i],i);
            }
        }

        return new int[] {};
    }
}
