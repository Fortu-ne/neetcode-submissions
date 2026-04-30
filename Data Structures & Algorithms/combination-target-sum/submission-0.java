class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
       List<List<Integer>> res = new ArrayList<>();
       ArrayList<Integer> subs = new ArrayList<>();

       if(nums == null) return  res;

       dfs (nums,target,subs, res,0);
        return  res;
    }

    public void dfs (int[] nums, int target,ArrayList<Integer> subs, List<List<Integer>> res,int i){

        if (target == 0) {
            res.add(new ArrayList(subs));
            return;
        }
        if (target < 0 || i >= nums.length) {
            return;
        }

        subs.add(nums[i]);
        dfs(nums, target - nums[i],subs,res, i);
        subs.remove(subs.size() - 1);
        dfs(nums, target, subs, res,i + 1);
    }
}
