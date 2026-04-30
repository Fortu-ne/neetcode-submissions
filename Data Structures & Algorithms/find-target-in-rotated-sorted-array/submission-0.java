class Solution {
    public int search(int[] nums, int target) {

       if(nums.length < 1) return 0;
     
        int num =0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if(!hash.containsKey(nums[i])){
                hash.put(nums[i],i);
            }
        }
        Arrays.sort(nums);
        if(hash.containsKey(target)){
            num = hash.get(target).intValue();
        }
        else {
            return -1;
        }
        
        return num;   
    }
}
