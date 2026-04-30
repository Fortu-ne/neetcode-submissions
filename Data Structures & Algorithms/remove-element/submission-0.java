class Solution {
    public int removeElement(int[] nums, int val) {
        

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i] != val) {
                
                list.add(nums[i]);
            }
            
        }


        for(int n = 0 ; n < list.size() ; n++)
        {
            nums[n] = list.get(n);
        }
        return list.size();
    }
}