class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
      if(nums.length < 1 || target < 0) return new ArrayList<>();
        
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        backtrack1(0,nums, target, current, res);
        
        return res;
    }

    private  void backtrack1(int i, int[] nums, int target, List<Integer> current, List<List<Integer>> res) {

        if(target == 0){
            res.add(new ArrayList<>(current));
            return;
        }

        if(i > target || i == nums.length){
            return;
        }



            current.add(nums[i]);
            backtrack1(i, nums, target - nums[i], current,res);
            current.remove(current.size()-1);
            backtrack1(i+1, nums,target,current,res);

    }
}
