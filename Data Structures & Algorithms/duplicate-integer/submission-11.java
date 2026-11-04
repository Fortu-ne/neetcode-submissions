class Solution {
    public boolean hasDuplicate(int[] nums) {
    if (nums.length < 1) return  false;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int n : nums){
            if(set.contains(n)){
                return true;
            }
            else{
                set.add(n);
            }
        }

        return false;
    }
}