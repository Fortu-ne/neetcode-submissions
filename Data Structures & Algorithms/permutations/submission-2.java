class Solution {
    public  List<List<Integer>> permute(int[] nums) {

        List<Integer> current = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        backtrack(current,list,nums);
        return list;

    }

    private static void backtrack(List<Integer> current, List<List<Integer>> list, int[] nums) {

        if(current.size() == nums.length){
            list.add(new ArrayList<>(current));
            return;
        }


        for (int i = 0; i < nums.length; i++) {

            if(!current.contains(nums[i])) {
                current.add(nums[i]);
                backtrack(current, list, nums);
                current.remove(current.size() - 1);
            }
        }
    }


}
