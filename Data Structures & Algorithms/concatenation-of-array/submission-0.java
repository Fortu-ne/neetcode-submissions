class Solution {
    public int[] getConcatenation(int[] nums) {
        
        if(nums.length < 0 )return null;

        int[] arr2 = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();

        int result_size = nums.length + arr2.length;

        int[] result_array = new int[result_size];



        System.arraycopy(nums,0, arr2,0, arr2.length);

        System.arraycopy(nums, 0, result_array,0, nums.length);
        System.arraycopy(arr2,0,result_array, nums.length, arr2.length);
            
            return result_array;
    }
}