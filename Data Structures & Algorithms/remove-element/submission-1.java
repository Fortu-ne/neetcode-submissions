class Solution {
    public int removeElement(int[] nums, int val) {
   List<Integer> list = new ArrayList<>();
        
        if(nums == null) return 0;
        
        for (int j = 0; j < nums.length; j++) {
            
            if(nums[j] != val){
                list.add(nums[j]);
            }
        }

         for(int n = 0 ; n < list.size() ; n++)
        {
            nums[n] = list.get(n);
        }
        
    
        
        return list.size();
    }
}