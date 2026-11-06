class Solution {
    public int findDuplicate(int[] nums) {
        
        if(nums.length < 1) return 0;

        HashSet<Integer> hash = new HashSet<>();

        for(int n : nums){
            
            if(hash.contains(n)){
                return n;
            }
            else{
                hash.add(n);
            }
        }



       return 0;
    }
}
