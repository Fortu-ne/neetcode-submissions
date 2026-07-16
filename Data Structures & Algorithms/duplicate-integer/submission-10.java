class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();

        if (nums.length < 1) return false;

        for(int num : nums){
            if(hash.contains(num))
            {
                return true;
            }
            else
            {
                hash.add(num);
            }
        }
        
        


        return false;
    }
}