class Solution {
    public int search(int[] nums, int target) {

        if(nums.length < 1) return 0;

       // HashMap<Integer,Integer> hash = new HashMap<>();

        for(int n = 0; n < nums.length; n++){

            if(nums[n] == target)
            {
                return n;
            }
        
        }



        

        return -1;
    }
}
