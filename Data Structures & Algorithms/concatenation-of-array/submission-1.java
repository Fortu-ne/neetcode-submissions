class Solution {
    public int[] getConcatenation(int[] nums) {

             if(nums.length == 0) return null;


        int num_size = nums.length;
        int size = num_size * 2;
        int[] result = new int[size];

        result = Arrays.copyOfRange(nums,0,size);

        for (int i = num_size; i < result.length; i++) {


            result[i] = nums[i - num_size];
        }

        return result;
    }
}