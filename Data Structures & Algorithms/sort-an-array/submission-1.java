class Solution {
    public int[] sortArray(int[] nums) {

  if(nums.length == 0) return new int[]{};

        Arrays.sort(nums);

        return nums;
    }
}