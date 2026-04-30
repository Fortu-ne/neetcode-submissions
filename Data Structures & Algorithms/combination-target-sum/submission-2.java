class Solution {
      public static List<List<Integer>> combinationSum(int[] nums, int target) {

        List<Integer> current = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();


        backtrack(0,nums,current,list, target);

        return list;
    }

    private static void backtrack(int i, int[] nums, List<Integer> current, List<List<Integer>> list, int target) {

        if(target == 0){
            list.add(new ArrayList<>(current));
            return;
        }


        if( i > target || i == nums.length){
            return;
        }

        current.add(nums[i]);
        backtrack(i,nums,current,list, target - nums[i]);
        current.remove(current.size() -1);
        backtrack(i+1,nums,current,list, target);




    }
}
