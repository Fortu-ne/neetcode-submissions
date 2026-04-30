class Solution {
   
   public int[] twoSum (int[] nums, int target){

        
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            
            hash.put(nums[i],i);
        }


        for (int i = 0; i < nums.length; i++) {

            int result = target - nums[i];
           
           

             if (hash.containsKey(result) && hash.get(result) != i){
                return  new int[] {i, hash.get(result)};
            
           }

        }

        return new int[] {};
    }
}
