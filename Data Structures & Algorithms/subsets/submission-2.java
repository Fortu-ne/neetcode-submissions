class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
         List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> sub = new ArrayList<>();



        if(nums == null ) return res;

        dfs(0,nums,res,sub);

        return res;
    }

    public void dfs(int index, int[] nums,   List<List<Integer>> res,  ArrayList<Integer> sub )
    {

        if(index >= nums.length){
  
              res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[index]);
        dfs(index + 1, nums,res,sub);
        sub.remove(sub.size() -1 );
        dfs(index + 1, nums,res,sub);

    }
}
