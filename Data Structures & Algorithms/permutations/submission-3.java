class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        if(nums.length < 1) return new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();


        backtrack(curr, nums , list);



        return list;
    }

     private static void backtrack( List<Integer> curr, int[] nums, List<List<Integer>> list) {

     if(curr.size() == nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }

        for(int n = 0; n< nums.length; n++){

           if(!curr.contains(nums[n])){
             curr.add(nums[n]);
            backtrack(curr,nums,list);
            curr.remove(curr.size()-1);
      
           }
       
        }
       

    }
}
