class Solution {
    public  List<List<Integer>> subsets(int[] nums) {

        List<Integer> current = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        backtrack(0, nums,current,list);
        return list;
    }

    private static void backtrack(int i, int[] nums, List<Integer> current, List<List<Integer>> list) {

        if(i == nums.length)
        {
            list.add(new ArrayList<>(current));
            return;
        }


        current.add(nums[i]);
        backtrack(i+1,nums,current,list);
        current.remove(current.size() -1);
        backtrack(i+1,nums,current,list);
    }


}
