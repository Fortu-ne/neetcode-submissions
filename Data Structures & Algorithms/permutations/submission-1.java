class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        ArrayList<Integer> sub = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        if(nums == null) return res;

        dfs(nums, sub,res,new boolean[nums.length]);


        return res;

    }

     public void dfs(int[] nums,ArrayList<Integer> sub, List<List<Integer>> res, boolean[] picked){


            if(sub.size() == nums.length)
            {
            res.add(new ArrayList<>(sub));
             return;
            }
           
        

       for(int i =0; i < nums.length; i++)
       {
        if(!picked[i]){

        sub.add(nums[i]);
        picked[i] = true;
        dfs(nums,sub,res, picked);
        sub.remove(sub.size() - 1);
        picked[i] = false;
        }
       }

      

    }
}
