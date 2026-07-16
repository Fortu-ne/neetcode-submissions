class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hash = new HashMap<>();
        
        if (nums.length < 1 ) { return null;}

         for(int n = 0; n < nums.length; n++){

            int total = target - nums[n];

              if(hash.containsKey(total)){
            return new int [] {hash.get(total), n};
          }
          else {
            hash.put(nums[n],n);
          }
         }

          return new int[]{};
    }
}
