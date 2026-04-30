class Solution {
  public static List<List<Integer>> combinationSum(int[] nums, int target) {

        List<Integer> current = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        backtrack(0,current,list,nums,target);
        return list;

    }

    private static void backtrack(int i, List<Integer> current, List<List<Integer>> list, int[] nums, int target) {

        if(target == 0){
            list.add(new ArrayList<>(current));
            return;
        }

        if (i >= nums.length || target < 0) {  // Proper bounds checking
            return;
        }

        current.add(nums[i]);
        backtrack(i,current,list,nums,target - nums[i]);
        current.remove(current.size()-1);
        backtrack(i+1,current,list,nums,target);

    }


}
